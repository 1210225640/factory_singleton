package com.vip.parrent.singleton.thread;

/**
 * @Data:2019/5/27 21:27
 * @Author:Dream
 */

/**
 * 伪线程安全，在同一线程中是安全的,无论在同一线程中无论new多少个都是安全的
 */
public class ThreadLocalSingleton {

    private  ThreadLocalSingleton(){};

    private  static  final  ThreadLocal<ThreadLocalSingleton> threadLocalInstance=
            new ThreadLocal<ThreadLocalSingleton>(){
                @Override
                protected ThreadLocalSingleton initialValue() {
                    return new ThreadLocalSingleton();
                }
            };

    public   static ThreadLocalSingleton getInstance(){
        return  threadLocalInstance.get();
    }
}
