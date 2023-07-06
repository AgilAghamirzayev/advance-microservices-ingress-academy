package com.ingress.fileprocessingms.repo;

import com.ingress.fileprocessingms.entity.ProcessedFile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProcessedFileRepository extends JpaRepository<ProcessedFile, Long> {
}
