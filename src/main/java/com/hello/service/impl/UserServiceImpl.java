package com.hello.service.impl;

import com.hello.dao.TbUserMapper;
import com.hello.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    TbUserMapper tbUserMapper;
    public String getUserName(String userName){
        List<String> userNameList = this.tbUserMapper.selectUser(userName);
        return userNameList.get(0);
    }



}
