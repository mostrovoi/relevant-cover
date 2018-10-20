package com.rc.authapi.controller.mapper;

import com.rc.authapi.domain.AppUser;
import com.rc.authapi.dto.UserDTO;

public class AppUserMapper {

    public static UserDTO toDTO(AppUser user) {
        UserDTO userDTO = new UserDTO();
        userDTO.setName(user.getName());
        userDTO.setSurnames(user.getSurname(), user.getLastSurname());
        userDTO.setCompanyRole(user.getRole());
        userDTO.setUserGroup(user.getUserGroup());
        userDTO.setPictureUrl(user.getPicture());
        return userDTO;
    }
}
