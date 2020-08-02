package com.example.enum_jpa_graphql.model;

import lombok.extern.slf4j.Slf4j;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Slf4j
@Converter
public class GenderAttributeConverter implements AttributeConverter<GenderType, Integer> {

    @Override
    public Integer convertToDatabaseColumn(GenderType attribute) {
        if(attribute.equals(GenderType.MALE)) {
            return 1;
        }

        return 2;
    }

    @Override
    public GenderType convertToEntityAttribute(Integer dbData) {
        if(1 == dbData) {
            return GenderType.MALE;
        }

        return GenderType.FEMALE;
    }
}
