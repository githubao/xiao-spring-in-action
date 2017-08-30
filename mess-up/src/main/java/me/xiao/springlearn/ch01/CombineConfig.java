package me.xiao.springlearn.ch01;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * 组合注解
 *
 * @author pacman
 * @version 1.0
 * @date: 2017/8/29 14:45
 */

@Configuration
@Import({KnightConfig.class, QueueConfig.class})
public class CombineConfig {
}
