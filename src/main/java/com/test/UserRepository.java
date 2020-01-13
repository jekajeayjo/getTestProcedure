package com.test;

import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserEntity,Integer> {
    @Procedure(name = "getPass")
    Iterable<UserDto> getPass();
}
