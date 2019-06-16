package com.heima.springboot.javaconfig;

import java.util.ArrayList;
import java.util.List;

/**
 * @创建人 steffens
 * @创建时间 2019/6/16
 * @描述 文件创建
 */
public class UserDAO {

    public List<User> queryUserList() {
        List<User> result = new ArrayList<User>();
        // 模拟数据库的查询
        for (int i = 0; i < 10; i++) {
            User user = new User();
            user.setUsername("username_" + i);
            user.setPassword("password_" + i);
            user.setAge(i + 1);
            result.add(user);
        }
        return result;
    }
}
