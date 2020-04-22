package com.emarket.api.dto;

import com.emarket.api.model.Role;
import lombok.Data;

import java.util.Set;

@Data
public class UserDto {
    private Long id;
    private String username;
    private Set<Role> roles;
    private boolean enabled;
}
