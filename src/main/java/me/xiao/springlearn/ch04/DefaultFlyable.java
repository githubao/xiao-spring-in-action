package me.xiao.springlearn.ch04;

import org.springframework.stereotype.Component;

/**
 * 默认的可飞行器
 *
 * @author pacman
 * @version 1.0
 * @date: 2017/8/30 11:36
 */

@Component
public class DefaultFlyable implements Flyable {
    @Override
    public void fly() {
        System.out.println("default fly");
    }
}
