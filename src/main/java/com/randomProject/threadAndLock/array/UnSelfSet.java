package com.randomProject.threadAndLock.array;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

/**
 * HashSet多线程边读边写抛出ConcurrentModificationException异常
 * 解决方案
 * 1. Collections.synchronizedSet(new HashSet<>()); 工具类复制
 * 2.
 */
public class UnSelfSet {
    public static void main(String[] args) {
        // Set<String> set = new HashSet<>();
        // Set<String> set = Collections.synchronizedSet(new HashSet<>());
        Set<String> set = new CopyOnWriteArraySet<>();
        Set<String> set2 = new CopyOnWriteArraySet<>();

        for (int i = 0; i < 20; i++) {
            new Thread(() -> {
                // ConcurrentModificationException 并发修改异常
                set.add(UUID.randomUUID().toString().substring(0, 5));
                System.out.println(set);
            }, "thread" + i).start();
        }
        /**
         * 解决方案
         */


    }
}
