package com.randomProject.reflex;

import com.randomProject.entity.Cat;

import java.lang.reflect.Method;

/**
 * @author ZhangYijing
 */
public class InvokeReflex {

    public static void main(String[] args) throws Exception {
        Cat cat = new Cat();

        Class<?> catClass = Class.forName("com.randomProject.entity.Cat");
        Method privateMethod = catClass.getDeclaredMethod("privateMethod", String.class, String.class, Integer.class);
        privateMethod.setAccessible(true);
        privateMethod.invoke(cat, "maomao", "ss", 16);
        System.out.println(cat);

    }

}