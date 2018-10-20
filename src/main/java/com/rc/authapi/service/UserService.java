package com.rc.authapi.service;

import com.rc.authapi.dto.UserDTO;

import java.util.NoSuchElementException;

public interface UserService {

    public UserDTO findUserBy(String username) throws NoSuchElementException;
}
