package me.xiao.springlearn.ch05.web;

import me.xiao.springlearn.ch05.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 注册的控制器
 *
 * @author pacman
 * @version 1.0
 * @date: 2017/8/30 18:37
 */

@Controller
public class RegisterController {

    private final UserRepository userRepository;

    @Autowired
    public RegisterController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String getRegister() {
        return "register";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String saveRegister(User user) {
        userRepository.save(user);

        return "redirect:/user/" + user.getName();
    }

}
