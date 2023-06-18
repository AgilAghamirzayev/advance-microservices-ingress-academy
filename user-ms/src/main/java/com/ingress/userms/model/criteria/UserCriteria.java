package com.ingress.userms.model.criteria;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserCriteria {
    private Integer ageFrom;
    private Integer ageTo;
    private String birthPlace;
}
