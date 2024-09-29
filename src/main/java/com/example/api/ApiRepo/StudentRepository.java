package com.example.api.ApiRepo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.api.ApiModel.Student;

public interface StudentRepository extends JpaRepository<Student, String> {

}
