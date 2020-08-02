package com.example.enum_jpa_graphql.resolver;

import com.example.enum_jpa_graphql.model.Gender;
import com.example.enum_jpa_graphql.model.GenderType;
import com.example.enum_jpa_graphql.repository.GenderRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@Slf4j
@RestController
@Component
@RequiredArgsConstructor
public class GenderResolver {

    private final GenderRepository genderRepository;

    @GetMapping("/")
    public List<Gender> getGenders() {
        List<Gender> result = genderRepository.findAll();

        log.info(result.toString());
        log.info("type : " + result.get(0).getGenderType());
        log.info("name : " + result.get(0).getGenderType());

        return result;
    }
}
