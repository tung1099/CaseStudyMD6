package com.codegym.casestudymd6.service.user;

import com.codegym.casestudymd6.model.User;
import com.codegym.casestudymd6.service.IGeneralService;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface IUserService extends IGeneralService<User>, UserDetailsService {
    User findByUserName(String username);
}