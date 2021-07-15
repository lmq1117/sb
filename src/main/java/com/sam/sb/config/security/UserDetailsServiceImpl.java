package com.sam.sb.config.security;

import cn.hutool.core.lang.Console;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private PasswordEncoder pw;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // 1 查db 看用户是否存在 如不存在 抛UsernameNotFoundException
        Console.log("############### loadUserByUsername");
        if(!"admin".equals(username)){
            throw new UsernameNotFoundException("用户名不存在");
        }
        //模拟查出来的密码
        String password = pw.encode("123");
        //2  把查询出来的密码进行解析，或直接把密码放入构造方法
        return new User(username,password, AuthorityUtils.commaSeparatedStringToAuthorityList("admin,normal"));
    }
}
