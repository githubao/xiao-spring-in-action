package me.xiao.springlearn.ch04;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * 听众
 *
 * @author pacman
 * @version 1.0
 * @date: 2017/8/29 18:02
 */

@Aspect
public class Audience {

    @Before(value = "execution(* me.xiao.springlearn.ch04.Performance.perform(..))")
    public void before() {
        System.out.println("before");
    }

    @AfterReturning("execution(* me.xiao.springlearn.ch04.Performance.perform(..))")
    public void afterReturn() {
        System.out.println("after return");
    }

    @AfterThrowing("execution(* me.xiao.springlearn.ch04.Performance.perform(..))")
    public void afterException() {
        System.out.println("after exception");
    }

}
