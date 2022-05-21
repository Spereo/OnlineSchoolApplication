package com.example.online_school.repos;

import com.example.online_school.models.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepo extends CrudRepository<Student, Long> {
}
