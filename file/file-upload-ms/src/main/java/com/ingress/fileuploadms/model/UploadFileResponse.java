package com.ingress.fileuploadms.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Builder
public class UploadFileResponse {
    private Long id;
    private String name;
    private String description;
    private List<ActualFileResponse> actualFileInfos;
}
