package com.heima.springboot.javaconfig;

/**
 * @创建人 steffens
 * @创建时间 2019/6/16
 * @描述 文件创建
 */
public class User {

    private String username;

    private String password;

    private Integer age;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

}
