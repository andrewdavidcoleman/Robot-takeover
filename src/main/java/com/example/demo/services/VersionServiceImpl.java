package com.example.demo.services;

import com.example.demo.dao.VersionDao;
import com.example.demo.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VersionServiceImpl implements VersionService {

    @Autowired
    VersionDao versionDao;

    public List<User> getUsers() {
        List<User> response = versionDao.getUsers();
        return response;
    }
    
    @Override
    public int setVersion(int inputVersion) {

        int user = inputVersion;
        return user;

    }

}
