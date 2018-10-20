package com.rc.authapi.service;

import com.rc.authapi.controller.mapper.AppUserMapper;
import com.rc.authapi.domain.AppUser;
import com.rc.authapi.dto.UserDTO;
import com.rc.authapi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDTO findUserBy(String username) throws NoSuchElementException {
        AppUser user = userRepository.findByUsername(username);
        if (user == null)
            throw new NoSuchElementException();
        return AppUserMapper.toDTO(user);
    }
}
