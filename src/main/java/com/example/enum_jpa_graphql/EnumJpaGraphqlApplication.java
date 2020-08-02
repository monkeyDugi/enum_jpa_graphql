package com.example.enum_jpa_graphql;

import com.example.enum_jpa_graphql.model.Gender;
import com.example.enum_jpa_graphql.model.GenderType;
import com.example.enum_jpa_graphql.repository.GenderRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Slf4j
@SpringBootApplication
public class EnumJpaGraphqlApplication {

    public static void main(String[] args) {
        SpringApplication.run(EnumJpaGraphqlApplication.class, args);
    }

    @Autowired
    GenderRepository genderRepository;

    @PostConstruct
    public void createGender() {
        Gender male =
                Gender.builder()
                .genderType(GenderType.MALE)
                .genderName(GenderType.MALE.getValue())
                .build();
        Gender female =
                Gender.builder()
                .genderType(GenderType.FEMALE)
                .genderName(GenderType.FEMALE.getValue())
                .build();

        List<Gender> list = new ArrayList<>();
        list.add(male);
        list.add(female);

        genderRepository.saveAll(list);

        log.info("gender data create");

        log.info(genderRepository.findAll().toString());
    }
}
