package org.cent.demo.service.impl;

import org.cent.demo.domain.User;
import org.cent.demo.mapper.UserMapper;
import org.cent.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @class: UserServerImpl
 * @description: 用户服务实现类
 * @author: cent
 * @create: 2020/3/15
 **/
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUser(int id) {
        return userMapper.selectByPrimaryKey(id);
    }
}
