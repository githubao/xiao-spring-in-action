package me.xiao.springlearn.ch05.web;

import me.xiao.springlearn.ch05.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 用户数据类
 *
 * @author pacman
 * @version 1.0
 * @date: 2017/8/30 17:34
 */

public interface UserRepository {
    List<User> findUsers();

    User findUserByName(String name);

    boolean save(User user);
}
