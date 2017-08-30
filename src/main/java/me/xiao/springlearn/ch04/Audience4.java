package me.xiao.springlearn.ch04;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * 有参数的注解
 *
 * @author pacman
 * @version 1.0
 * @date: 2017/8/30 11:11
 */

@Aspect
public class Audience4 {

    @Pointcut(value = "execution(* me.xiao.springlearn.ch04.Performance.perform(String)) && args(name)")
    public void performance(String name) {
    }

    @Around("performance(name)")
    public Object watchPerformance(ProceedingJoinPoint jp, String name) {
        try {
            System.out.println("start4");

            Object obj = jp.proceed(new Object[]{name});

            System.out.println(obj);

            System.out.println("end4");

            return obj;

        } catch (Throwable throwable) {
            System.out.println("err occur");
        }

        return null;
    }


}
