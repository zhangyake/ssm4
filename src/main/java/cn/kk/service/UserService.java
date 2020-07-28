package cn.kk.service;

import cn.kk.domain.User;

import java.util.List;

public interface UserService {
    List<User> getUserList(User user);
    void saveUser(User user);
}
