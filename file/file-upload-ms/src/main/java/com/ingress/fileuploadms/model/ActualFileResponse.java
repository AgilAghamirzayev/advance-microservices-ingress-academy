package com.ingress.fileuploadms.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class ActualFileResponse {
    private Long id;
    private String originalFileName;
    private String contentType;
    private Long size;
}
