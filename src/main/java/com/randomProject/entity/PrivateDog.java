package com.randomProject.entity;

/**
 *  私有化构造方法的狗
 * @author ZhangYijing
 */
public class PrivateDog {

    public PrivateDog() {
    }

    String name;

    Integer age;

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

    @Override
    public String toString() {
        return "PrivateDog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}