package com.devglan;

import com.devglan.dao.UserDao;
import com.devglan.model.User;
import com.devglan.model.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.Arrays;

@SpringBootApplication
public class Application {

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);

    }

}
