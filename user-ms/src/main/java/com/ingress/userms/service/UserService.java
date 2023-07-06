package com.ingress.userms.service;

import com.ingress.userms.entity.UserEntity;
import com.ingress.userms.mapper.UserMapper;
import com.ingress.userms.model.criteria.PageCriteria;
import com.ingress.userms.model.criteria.UserCriteria;
import com.ingress.userms.model.request.UserRequest;
import com.ingress.userms.model.response.PageableUserResponse;
import com.ingress.userms.repository.UserRepository;
import com.ingress.userms.service.specification.UserSpecification;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

import static com.ingress.userms.mapper.UserMapper.mapEntityToEntity;
import static com.ingress.userms.model.constants.CriteriaConstants.COUNT_DEFAULT_VALUE;
import static com.ingress.userms.model.constants.CriteriaConstants.PAGE_DEFAULT_VALUE;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    @SneakyThrows
    public void saveUser(UserRequest userRequest) {
        Thread.sleep(2000);
        UserEntity userEntity = mapEntityToEntity(userRequest);
        userRepository.save(userEntity);
    }


    public PageableUserResponse getUsers(PageCriteria pageCriteria, UserCriteria userCriteria) {
        var pageNumber = pageCriteria.getPage() == null ? PAGE_DEFAULT_VALUE : pageCriteria.getPage();
        var count = pageCriteria.getCount() == null ? COUNT_DEFAULT_VALUE : pageCriteria.getCount();

        var usersPage = userRepository.findAll(new UserSpecification(userCriteria), PageRequest.of(pageNumber, count));

        return mapToPageableResponse(usersPage);
    }

    private PageableUserResponse mapToPageableResponse(Page<UserEntity> usersPage) {
        return PageableUserResponse.builder()
                .users(usersPage.getContent().stream().map(UserMapper::mapEntityToResponse).collect(Collectors.toList()))
                .hasNextPage(usersPage.hasNext())
                .lastPageNumber(usersPage.getTotalPages())
                .totalElements(usersPage.getTotalElements())
                .build();

    }
}
