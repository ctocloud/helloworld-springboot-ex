package com.heima.springboot.javaconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @创建人 steffens
 * @创建时间 2019/6/16
 * @描述 文件创建
 */
@Service
public class UserService {

    @Autowired // 注入Spring容器中的bean对象
    private UserDAO userDAO;

    public List<User> queryUserList() {
        // 调用userDAO中的方法进行查询
        return this.userDAO.queryUserList();
    }

}

