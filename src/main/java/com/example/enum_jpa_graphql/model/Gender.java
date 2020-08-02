package com.example.enum_jpa_graphql.model;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@ToString
@Getter
@NoArgsConstructor
@Entity
public class Gender {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    @Convert(converter = GenderAttributeConverter.class)
    @Column(nullable = false)
    private GenderType genderType;

    @Column(nullable = false, length = 1)
    private String genderName;

    @Builder
    public Gender(GenderType genderType, String genderName) {
       this.genderType = genderType;
       this.genderName = genderName;
    }
}