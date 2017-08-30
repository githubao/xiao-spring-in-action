package me.xiao.springlearn.ch05.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * index
 *
 * @author pacman
 * @version 1.0
 * @date: 2017/8/30 15:19
 */

@Controller
@RequestMapping({"/", "homepage", "index"})
public class HomeController {

    @RequestMapping(method = RequestMethod.GET)
    public String home() {
        return "home";
    }

}
