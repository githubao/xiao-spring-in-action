package me.xiao.springlearn.ch01;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * knight 配置类
 *
 * @author pacman
 * @version 1.0
 * @date: 2017/8/25 17:45
 */

@Configuration
public class KnightConfig {
    @Bean
    public Knight knight() {
        return new BraveKnight(quest());
    }

    @Bean
    public Quest quest() {
        return new DeafultWQuest(System.out);
    }


}
