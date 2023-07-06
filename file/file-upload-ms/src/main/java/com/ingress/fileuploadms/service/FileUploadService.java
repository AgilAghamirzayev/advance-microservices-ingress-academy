package com.ingress.fileuploadms.service;

import com.ingress.fileuploadms.client.FileProcessingServiceClient;
import com.ingress.fileuploadms.entity.ActualFile;
import com.ingress.fileuploadms.entity.UploadedFile;
import com.ingress.fileuploadms.model.UploadFileRequest;
import com.ingress.fileuploadms.repo.UploadedFileRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class FileUploadService {
    private final UploadedFileRepository uploadedFileRepository;
    private final FileProcessingServiceClient fileProcessingServiceClient;

    public void uploadFile(List<MultipartFile> files, UploadFileRequest request) {
        // Save the uploaded file to the repository

        List<ActualFile> actualFiles = new ArrayList<>();

        files.parallelStream().forEach(file ->
                actualFiles.add(ActualFile.builder()
                        .originalFileName(file.getOriginalFilename())
                        .size(file.getSize())
                        .contentType(file.getContentType())
                        .build()));

        UploadedFile uploadedFile = UploadedFile.builder()
                .name(request.getName())
                .description(request.getDescription())
                .fileInfos(actualFiles)
                .build();

        UploadedFile savedFile = uploadedFileRepository.save(uploadedFile);


        // Call the file processing service to process the file
        fileProcessingServiceClient.processFile(uploadedFile.getId(), files, request);
    }
}
