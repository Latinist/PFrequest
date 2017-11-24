package com.antonromanov.pf.springjpahibernatear.resource;

import com.antonromanov.pf.springjpahibernatear.model.Users;
import com.antonromanov.pf.springjpahibernatear.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rest/users")
public class UserResource {

    @Autowired
    UsersRepository usersRepository;

    @GetMapping("/all")
    public List<Users> getAll(){

return  usersRepository.findAll();
    }

}
