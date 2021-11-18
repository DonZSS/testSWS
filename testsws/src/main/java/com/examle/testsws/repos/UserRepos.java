package com.examle.testsws.repos;

import com.examle.testsws.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepos extends CrudRepository<User, Integer> {
}
