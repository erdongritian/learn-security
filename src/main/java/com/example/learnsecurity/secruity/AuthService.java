package com.example.learnsecurity.secruity;

import com.example.learnsecurity.model.User;

public interface AuthService {
    User register(User userToAdd);
    String login(String username, String password);
    String refresh(String oldToken);
}

