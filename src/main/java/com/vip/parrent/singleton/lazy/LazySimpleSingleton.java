package com.vip.parrent.singleton.lazy;

/**
 * 2019/5/11
 * Creator:编程浪子
 */

//懒汉式单利
    //在外部类调用时才实例
public class LazySimpleSingleton {
    //实例对象,等用户调用时再提供实例
    private  static LazySimpleSingleton lazy=null;

    //1.构造方法私有化
    private LazySimpleSingleton(){};

    //2.提供全局访问点
    public synchronized static LazySimpleSingleton getInstance(){
        //保证只初始化一次
        if (lazy==null) {
            lazy = new LazySimpleSingleton();
        }
        return  lazy;
    };
}
