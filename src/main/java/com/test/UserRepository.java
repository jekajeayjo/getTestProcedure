package com.test;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserEntity,Integer> {
    @Procedure(name = "getPass")
    Iterable<UserDto> getPass();

    @Query( "select  new com.test.UserDto(user.name,user.password) from UserEntity user")
    Iterable<UserDto> getWithoutId();
}
