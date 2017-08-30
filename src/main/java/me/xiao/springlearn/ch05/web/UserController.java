package me.xiao.springlearn.ch05.web;

import me.xiao.springlearn.ch05.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 用户的控制器
 *
 * @author pacman
 * @version 1.0
 * @date: 2017/8/30 17:37
 */

@Controller
public class UserController {

    private final UserRepository userRepository;

    @Autowired
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @RequestMapping(value = "/users",method = RequestMethod.GET)
    public String getUsers(Model model) {
        model.addAttribute(userRepository.findUsers());
        return "users";
    }

    @RequestMapping(value = "/user/{name}", method = RequestMethod.GET)
    public String getUserByName(@PathVariable("name") String name, Model model) {
        model.addAttribute(userRepository.findUserByName(name));
        return "user";
    }
}
