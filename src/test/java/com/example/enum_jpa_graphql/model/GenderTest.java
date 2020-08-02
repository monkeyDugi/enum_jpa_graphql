package com.example.enum_jpa_graphql.model;

import com.example.enum_jpa_graphql.repository.GenderRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GenderTest {

    @Autowired
    private GenderRepository genderRepository;

    @Test
    public void test() {
        List<Gender> list = genderRepository.findAll();

        System.out.println(list);

        GenderType male = list.get(0).getGenderType();
        assertThat(male).isEqualTo(GenderType.MALE);

        GenderType female = list.get(1).getGenderType();
        assertThat(female).isEqualTo(GenderType.FEMALE);
    }
}