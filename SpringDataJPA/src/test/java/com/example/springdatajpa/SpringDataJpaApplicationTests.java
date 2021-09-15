package com.example.springdatajpa;

import com.example.springdatajpa.entity.Student;
import com.example.springdatajpa.repository.StudentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringDataJpaApplicationTests {

    @Autowired
    private StudentRepository studentRepository;

    @Test
    void testSaveOnRepoBranch() {
        Student student = new Student("Nguyen Thanh", "Trung");
        studentRepository.save(student);
    }

    @Test
    void testReadOnRepoBranch(){
        System.out.println(studentRepository.findAll());
    }

    @Test
    void testUpdateRepoBranch(){
        Student student = studentRepository.findAll().get(0);
        student.setLastName("Hoai");
        studentRepository.save(student);
    }

    @Test
    void testDeleteRepoBranch(){
        studentRepository.deleteAll();
    }

}
