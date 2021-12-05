package com.sam.sb.dao.mapper;

import com.sam.sb.dao.entity.Users;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UsersMapper {
    //@Select("select * from users")
    //List<Users> getUsersList();

    public Users selectUsersById(Long id);
}
