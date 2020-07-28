package cn.kk.dao;

import cn.kk.domain.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {

    List<User> getUserList(User user);

    void saveUser(User user);
}
