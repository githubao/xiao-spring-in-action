package me.xiao.springlearn.ch05.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * root config
 *
 * @author pacman
 * @version 1.0
 * @date: 2017/8/30 14:56
 */

@Configuration
@ComponentScan(basePackages = {"me.xiao.springlearn.ch05"}, excludeFilters = {
        @ComponentScan.Filter(type = FilterType.ANNOTATION, value = EnableWebMvc.class)
})
public class RootConfig {

}
