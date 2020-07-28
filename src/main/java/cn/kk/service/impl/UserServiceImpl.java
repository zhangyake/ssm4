package cn.kk.service.impl;

import cn.kk.dao.UserDao;
import cn.kk.domain.User;
import cn.kk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> getUserList(User user) {
        return userDao.getUserList(user);
    }

    @Override
    public void saveUser(User user) {
        userDao.saveUser(user);
        System.out.println("service is 调用了");
//        userDao.saveUser();
    }
}
