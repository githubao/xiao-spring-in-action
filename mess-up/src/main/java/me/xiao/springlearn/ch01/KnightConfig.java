package me.xiao.springlearn.ch01;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

/**
 * knight 配置类
 *
 * @author pacman
 * @version 1.0
 * @date: 2017/8/25 17:45
 */

@Import(QueueConfig.class)
@ImportResource("classpath:META-INF/spring/knight.xml")
@Configuration
public class KnightConfig {
    @Bean
    public Knight knight(Quest quest) {
        return new BraveKnight(quest);
    }

}
