package me.xiao.springlearn.ch04;

import org.springframework.stereotype.Component;

/**
 * 女演员
 *
 * @author pacman
 * @version 1.0
 * @date: 2017/8/30 10:41
 */

@Component
public class Actress implements Performance {
    @Override
    public void perform() {
        System.out.println("i am a actress");
    }

    @Override
    public String perform(String name) {
        System.out.println(String.format("hello, %s. i am a actress.", name));
        return String.format("hi, %s.", name);
    }
}
