package me.xiao.springlearn.ch05.web;

import me.xiao.springlearn.ch05.User;
import org.springframework.stereotype.Repository;

import java.util.*;
import java.util.stream.Collectors;

/**
 * user repository impl
 *
 * @author pacman
 * @version 1.0
 * @date: 2017/8/30 17:47
 */

@Repository
public class UserRepositoryImpl implements UserRepository {

    private static final Map<String, User> users = new HashMap<>();

    static {
        users.put("xiao", new User("xiao", 18));
        users.put("qing", new User("qing", 16));
        users.put("john", new User("john", 20));
    }

    public UserRepositoryImpl() {
    }

    @Override
    public List<User> findUsers() {
        return new ArrayList<>(users.values());
    }

    @Override
    public User findUserByName(String name) {
        return users.getOrDefault(name, null);
    }

    @Override
    public boolean save(User user) {
        users.put(user.getName(), user);
        return true;
    }
}
