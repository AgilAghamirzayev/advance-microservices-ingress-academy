package com.ingress.userms.repository;

import com.ingress.userms.entity.UserEntity;
import com.ingress.userms.service.specification.UserSpecification;
import org.hibernate.query.criteria.spi.CriteriaBuilderExtension;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long>, JpaSpecificationExecutor<UserEntity> {

}
