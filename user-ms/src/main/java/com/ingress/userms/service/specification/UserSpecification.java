package com.ingress.userms.service.specification;

import com.ingress.userms.entity.UserEntity;
import com.ingress.userms.model.criteria.UserCriteria;
import com.ingress.userms.util.PredicateUtil;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.domain.Specification;

import static com.ingress.userms.model.constants.CriteriaConstants.AGE;
import static com.ingress.userms.model.constants.CriteriaConstants.BIRTH_PLACE;
import static com.ingress.userms.util.PredicateUtil.applyLikePattern;

@RequiredArgsConstructor
public class UserSpecification implements Specification<UserEntity> {

    private final UserCriteria userCriteria;

    @Override
    public Predicate toPredicate(Root<UserEntity> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
        var predicates = PredicateUtil.builder()
                .addNullSafety(userCriteria.getBirthPlace(),
                        birthPlace ->  cb.like(root.get(BIRTH_PLACE), applyLikePattern(birthPlace))
                )
                .addNullSafety(userCriteria.getAgeFrom(), ageFrom -> cb.greaterThanOrEqualTo(root.get(AGE), ageFrom))
                .addNullSafety(userCriteria.getAgeTo(), ageTo -> cb.lessThanOrEqualTo(root.get(AGE), ageTo))
                .build();
        return cb.and(predicates);
    }
}
