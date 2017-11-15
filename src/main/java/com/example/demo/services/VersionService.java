package com.example.demo.services;

import com.example.demo.domain.User;

import java.util.List;

public interface VersionService {
    List<User> getUsers();
    int setVersion(int input);
}
