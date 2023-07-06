package com.ingress.fileuploadms.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class UploadFileRequest {
    private String name;
    private String description;
}
