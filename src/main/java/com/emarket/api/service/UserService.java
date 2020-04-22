package com.emarket.api.service;

import com.emarket.api.model.User;

public interface UserService {
    User findByUsername(String username);
}
