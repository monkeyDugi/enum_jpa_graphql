package com.example.enum_jpa_graphql.model;

import lombok.Getter;

@Getter
public enum GenderType {

    MALE(1, "남"),
    FEMALE(2, "여");

    private final Integer code;
    private final String value;

    GenderType(Integer code, String value) {
        this.code = code;
        this.value = value;
    }
}
