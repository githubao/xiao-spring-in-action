package me.xiao.springlearn.ch04;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 * 使用around创建
 *
 * @author pacman
 * @version 1.0
 * @date: 2017/8/30 11:03
 */

@Aspect
public class Audience3 {
    @Pointcut("execution(* me.xiao.springlearn.ch04.Performance.perform(..))")
    public void performance() {
    }

    @Around("performance()")
    public void watchPerformance(ProceedingJoinPoint jp){
        try {
            System.out.println("start");

            Object obj = jp.proceed();

            System.out.println("end");
        } catch (Throwable throwable) {
            System.out.println("err occur");
        }
    }

}
