package me.xiao.springlearn.ch01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 骑士运行
 *
 * @author pacman
 * @version 1.0
 * @date: 2017/8/25 17:43
 */

public class KnightApp {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("META-INF/spring/knight.xml");

        Knight knight = ctx.getBean(Knight.class);

        knight.embarkOnQuest();
    }

    public static void main2(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(KnightConfig.class);

        Knight knight = ctx.getBean(Knight.class);

        knight.embarkOnQuest();
    }
}
