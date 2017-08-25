package me.xiao.springlearn.ch01;

/**
 * 请求
 *
 * @author pacman
 * @version 1.0
 * @date: 2017/8/25 17:27
 */

public interface Quest {
    void embark();

    default void beforeEmbark(){}

    default void afterEmbark(){}
}
