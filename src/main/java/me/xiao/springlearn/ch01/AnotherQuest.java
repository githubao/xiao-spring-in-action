package me.xiao.springlearn.ch01;

/**
 * 包含前置和后置处理的quest
 *
 * @author pacman
 * @version 1.0
 * @date: 2017/8/25 17:57
 */

public class AnotherQuest implements Quest{
    @Override
    public void embark() {
        System.out.println("another quest");
    }

    @Override
    public void beforeEmbark() {
        System.out.println("before embark");
    }

    @Override
    public void afterEmbark() {
        System.out.println("after embark");
    }
}
