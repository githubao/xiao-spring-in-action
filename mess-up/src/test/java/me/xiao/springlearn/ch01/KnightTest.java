package me.xiao.springlearn.ch01;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author pacman
 * @version 1.0
 * @date: 2017/8/29 11:32
 */

public class KnightTest {

    @Test
    public void main() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("META-INF/spring/knight.xml");

        Knight knight = ctx.getBean(Knight.class);

        knight.embarkOnQuest();
    }

    @Test
    public void test2() {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(KnightConfig.class);

        Knight knight = ctx.getBean(Knight.class);

        knight.embarkOnQuest();
    }
}