package com.ingress.fileprocessingms.service;

import com.ingress.fileprocessingms.entity.ProcessedFile;
import com.ingress.fileprocessingms.repo.ProcessedFileRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import java.io.IOException;

@Service
@RequiredArgsConstructor
public class FileProcessingService {
    private final ProcessedFileRepository processedFileRepository;

    public void processFile(Long fileId, MultipartFile file) {
        // Process the file as required

        // Save the processed file to the repository
        ProcessedFile processedFile = new ProcessedFile();
        processedFile.setFileName(file.getOriginalFilename());
        processedFile = processedFileRepository.save(processedFile);
    }
}
