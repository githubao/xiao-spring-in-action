package me.xiao.springlearn.ch04;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 女演员
 *
 * @author pacman
 * @version 1.0
 * @date: 2017/8/30 10:46
 */

@ContextConfiguration(classes = AudienceConfig2.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class ActressTest {

    @Autowired
    private Actress actress;

    @Test
    public void testActress() {
//        actress.perform();
        actress.perform("xiao");
    }

    @Test
    public void testActressIntruduce() {
        actress.perform("1");
        
        ((Flyable) actress).fly();
    }
}