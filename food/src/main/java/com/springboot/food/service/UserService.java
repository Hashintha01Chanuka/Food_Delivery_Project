package com.springboot.food.service;

import com.springboot.food.io.UserRequest;
import com.springboot.food.io.UserResponse;

public interface UserService {

    UserResponse registerUser(UserRequest request);
}
