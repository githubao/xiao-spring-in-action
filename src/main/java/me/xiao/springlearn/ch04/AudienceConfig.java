package me.xiao.springlearn.ch04;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * audience config
 *
 * @author pacman
 * @version 1.0
 * @date: 2017/8/29 18:20
 */

@Configuration
@EnableAspectJAutoProxy(proxyTargetClass = true)
@ComponentScan
public class AudienceConfig {

    @Bean
    public Audience4 audience() {
        return new Audience4();
    }
}
