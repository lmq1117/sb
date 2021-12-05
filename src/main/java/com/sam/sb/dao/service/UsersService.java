package com.sam.sb.dao.service;

import com.sam.sb.dao.entity.Users;
import com.sam.sb.dao.mapper.UsersMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersService {


    @Autowired
    UsersMapper usersMapper;


    public Users selectUsersById(Long id){
        return usersMapper.selectUsersById(id);
    }




}
