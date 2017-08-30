package me.xiao.springlearn.ch01.autoscan;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 * 测试自动扫描
 *
 * @author pacman
 * @version 1.0
 * @date: 2017/8/29 11:29
 */

@ActiveProfiles("dev")
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AutoConfig.class)
public class AutoConfigTest {

    @Autowired
    private Cat cat;

    @Test
    public void test() {
        cat.sayHello();
    }
}