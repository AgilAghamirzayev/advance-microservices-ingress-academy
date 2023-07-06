package com.ingress.fileuploadms.client;

import com.ingress.fileuploadms.model.UploadFileRequest;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@FeignClient(name = "file-processing-service", url = "http://file-processing-service-url")
public interface FileProcessingServiceClient {
    @PostMapping(value = "/process-file/{id}", consumes = {
            MediaType.MULTIPART_FORM_DATA_VALUE,
            MediaType.APPLICATION_JSON_VALUE
    })
    void processFile(@PathVariable Long id,
                     @RequestPart("file") List<MultipartFile> files,
                     @RequestBody UploadFileRequest request);
}
