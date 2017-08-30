package me.xiao.springlearn.ch05;

import java.util.concurrent.atomic.AtomicLong;

/**
 * pojo user
 *
 * @author pacman
 * @version 1.0
 * @date: 2017/8/30 17:32
 */

public class User {
    private static AtomicLong uid = new AtomicLong();
    private Integer id;
    private String name;
    private Integer age;

    public User() {
        this.id = Math.toIntExact(uid.incrementAndGet());
    }

    public User(String name, Integer age) {
        this();
        this.name = name;
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
