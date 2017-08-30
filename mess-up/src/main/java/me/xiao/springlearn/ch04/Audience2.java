package me.xiao.springlearn.ch04;

import org.aspectj.lang.annotation.*;

/**
 * 听众
 *
 * @author pacman
 * @version 1.0
 * @date: 2017/8/29 18:02
 */

@Aspect
public class Audience2 {

    @Pointcut(value = "execution(* me.xiao.springlearn.ch04.Performance.perform(..))")
    public void performance(){}

    @Before("performance()")
    public void before() {
        System.out.println("before2");
    }

    @AfterReturning("performance()")
    public void afterReturn() {
        System.out.println("after return2");
    }

    @AfterThrowing("performance()")
    public void afterException() {
        System.out.println("after exception2");
    }

}
