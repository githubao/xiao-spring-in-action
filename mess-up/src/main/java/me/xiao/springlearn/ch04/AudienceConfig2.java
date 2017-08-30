package me.xiao.springlearn.ch04;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * 配置类
 *
 * @author pacman
 * @version 1.0
 * @date: 2017/8/30 11:38
 */

@Configuration
@ComponentScan
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class AudienceConfig2 {

    @Bean
    public FlyableIntroducer flyableIntroducer() {
        return new FlyableIntroducer();
    }
}
