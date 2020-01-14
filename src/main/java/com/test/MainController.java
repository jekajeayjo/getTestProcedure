package com.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    UserRepository userRepository;
    @Autowired
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @RequestMapping( value = "user",method = RequestMethod.GET)
    public Iterable<UserDto> userDtos()
    {

        return   userRepository.getPass();
    }
    @RequestMapping( value = "usere",method = RequestMethod.GET)
    public Iterable<UserEntity> userEntities()
    {

        return   userRepository.findAll();
    }
    @RequestMapping( value = "userselect",method = RequestMethod.GET)
    public Iterable<UserDto> userDtoQuery()
    {

        return   userRepository.getWithoutId();
    }
}
