package com.service;

import com.jpa.UserListInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class service {

    @Autowired
    UserListInterface userListInterface;
    public List returnList() {
        return userListInterface.findAll();
    }
}
