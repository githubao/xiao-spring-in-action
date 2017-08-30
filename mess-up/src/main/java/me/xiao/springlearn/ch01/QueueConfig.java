package me.xiao.springlearn.ch01;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * queue config
 *
 * @author pacman
 * @version 1.0
 * @date: 2017/8/29 14:44
 */

@Configuration
public class QueueConfig {
    @Bean
    public Quest quest() {
        return new DefaultWQuest(System.out);
    }
}
