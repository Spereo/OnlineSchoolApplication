package com.example.online_school.repos;

import com.example.online_school.models.Teacher;
import org.springframework.data.repository.CrudRepository;

public interface TeacherRepo extends CrudRepository<Teacher, Long> {
}
