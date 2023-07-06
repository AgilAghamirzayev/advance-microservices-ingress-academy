package com.ingress.fileprocessingms.controller;

import com.ingress.fileprocessingms.service.FileProcessingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class FileProcessingController {
    private final FileProcessingService fileProcessingService;

    @Autowired
    public FileProcessingController(FileProcessingService fileProcessingService) {
        this.fileProcessingService = fileProcessingService;
    }

    @PostMapping("/process-file/{id}")
    public ResponseEntity<String> processFile(@PathVariable Long id,
                                              @RequestPart("file") MultipartFile file) {
        fileProcessingService.processFile(id, file);
        return ResponseEntity.ok("File processed successfully");

    }
}
