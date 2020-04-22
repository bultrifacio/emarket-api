package com.emarket.api.converter;

import com.emarket.api.dto.UserDto;
import com.emarket.api.model.User;
import org.springframework.stereotype.Component;

@Component
public class UserConverter {

    public UserDto convertFromEntity(User user) {
        UserDto userDto = new UserDto();
        userDto.setId(user.getId());
        userDto.setUsername(user.getUsername());
        return userDto;
    }
}
