package com.example.springdatajpa;

import com.example.springdatajpa.repository.StudentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringDataJpaApplicationTests {

    @Autowired
    private StudentRepository studentRepository;

    @Test
    void SelectByNative() {
        System.out.println(studentRepository.SelectByNative());
    }

}
