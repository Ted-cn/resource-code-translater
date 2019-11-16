package com.cui.java;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Hello {
    public static void main(String[] args) {

        Lock lock = new ReentrantLock();

        System.out.println(lock);
    }
}
