package com.ingress.fileuploadms.repo;

import com.ingress.fileuploadms.entity.UploadedFile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UploadedFileRepository extends JpaRepository<UploadedFile, Long> {
}
