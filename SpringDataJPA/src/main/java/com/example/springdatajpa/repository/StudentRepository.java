package com.example.springdatajpa.repository;

import com.example.springdatajpa.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {
    @Query(value = "Select * from student", nativeQuery = true)
    List<Student> SelectByNative();

    @Query(value = "delete * from student", nativeQuery = true)
    void deleteByNative();
}
