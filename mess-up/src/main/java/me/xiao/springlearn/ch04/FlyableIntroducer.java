package me.xiao.springlearn.ch04;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

/**
 * 可以飞行的切面
 *
 * @author pacman
 * @version 1.0
 * @date: 2017/8/30 11:35
 */

@Aspect
public class FlyableIntroducer {

    @DeclareParents(value = "me.xiao.springlearn.ch04.Performance+", defaultImpl = DefaultFlyable.class)
    public static Flyable flyable;
}
