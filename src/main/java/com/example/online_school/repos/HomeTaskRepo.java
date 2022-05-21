package com.example.online_school.repos;

import com.example.online_school.models.HomeTask;
import org.springframework.data.repository.CrudRepository;

public interface HomeTaskRepo extends CrudRepository<HomeTask, Long> {
}
