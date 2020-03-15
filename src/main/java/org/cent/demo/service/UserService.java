package org.cent.demo.service;

import org.cent.demo.domain.User;

/**
 * @interface: UserServer
 * @description: 用户服务接口
 * @author: cent
 * @create: 2020/3/15
 **/
public interface UserService {

    /**
     * 取用户信息
     * @param id 用户编号
     * @return 用户实例
     */
    User getUser(int id);
}
