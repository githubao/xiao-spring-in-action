package me.xiao.springlearn.ch01.autoscan;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * bean的自动配置
 *
 * @author pacman
 * @version 1.0
 * @date: 2017/8/29 11:23
 */

@ComponentScan(basePackages = {"me.xiao.springlearn"})
@Configuration
public class AutoConfig {
}
