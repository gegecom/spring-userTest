package com.hello.dao;

import com.hello.model.TbUser;

import java.util.List;
import java.util.Map;

public interface TbUserMapper {
    public int insertData(Map<String,String> paramMap);

    public String selectData(Map<String,String> paramMap);

    public List<String> selectAllData(String tableName);

    public List<String> selectUser(String userName);
}