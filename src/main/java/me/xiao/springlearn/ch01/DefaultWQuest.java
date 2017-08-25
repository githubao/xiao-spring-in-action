package me.xiao.springlearn.ch01;

import java.io.PrintStream;

/**
 * 默认的请求的实现
 *
 * @author pacman
 * @version 1.0
 * @date: 2017/8/25 17:29
 */

public class DefaultWQuest implements Quest {

    private PrintStream stream;

    public DefaultWQuest(PrintStream stream) {
        this.stream = stream;
    }

    @Override
    public void embark() {
        stream.println("default quest");
    }
}
