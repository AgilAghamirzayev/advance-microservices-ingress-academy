package com.ingress.fileuploadms.controller;

import com.ingress.fileuploadms.model.UploadFileRequest;
import com.ingress.fileuploadms.service.FileUploadService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class FileUploadController {
    private final FileUploadService fileUploadService;

    @PostMapping(path = "/upload",  consumes = {
            MediaType.MULTIPART_FORM_DATA_VALUE,
            MediaType.APPLICATION_JSON_VALUE
    })
    public ResponseEntity<String> uploadFile(@RequestPart("file") List<MultipartFile> files,
                                             @RequestBody UploadFileRequest uploadFileRequest) {
        fileUploadService.uploadFile(files, uploadFileRequest);
        return ResponseEntity.ok("File uploaded successfully");
    }
}