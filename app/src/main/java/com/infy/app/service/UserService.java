package com.infy.app.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import com.infy.app.dto.UserRegistrationDto;
import com.infy.app.model.User;

public interface UserService extends UserDetailsService {
    User save(UserRegistrationDto registrationDto);
}