package com.example.online_school.repos;

import com.example.online_school.models.Exam;
import org.springframework.data.repository.CrudRepository;

public interface ExamRepo extends CrudRepository<Exam, Long> {
}
