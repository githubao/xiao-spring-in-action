package me.xiao.springlearn.ch01.autoscan;

import org.springframework.stereotype.Component;

/**
 * i am a cat
 *
 * @author pacman
 * @version 1.0
 * @date: 2017/8/29 11:21
 */

@Component("smallCat")
public class Cat implements Animal {
    @Override
    public void sayHello() {
        System.out.println("i am a cat");
    }
}
