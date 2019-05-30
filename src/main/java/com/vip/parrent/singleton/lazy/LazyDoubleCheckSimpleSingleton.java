package com.vip.parrent.singleton.lazy;

/**
 * 2019/5/11
 * Creator:编程浪子
 */

//懒汉式单利
    //在外部类调用时才实例
public class LazyDoubleCheckSimpleSingleton {
    //实例对象,等用户调用时再提供实例
    private volatile   static LazyDoubleCheckSimpleSingleton lazy=null;

    //1.构造方法私有化
    private LazyDoubleCheckSimpleSingleton(){};

    //2.提供全局访问点
    //适中方案
    //双重检查锁
    public  static LazyDoubleCheckSimpleSingleton getInstance(){
        //保证只初始化一次
        if (lazy==null) {
            //至少线程能进入方法，至少不会被锁
            synchronized (LazyDoubleCheckSimpleSingleton.class) {
                if (lazy==null) {
                    lazy = new LazyDoubleCheckSimpleSingleton();

                    //CPU执行时会转换成JVM指令执行
                    //有可能发生2-3步骤颠倒问题，指令重排序问题，volatile
                    //1.分配内存空间
                    //2.初始化对象
                    //3.将初始化好的对象和内存地址建立关连，赋值‘
                    //用户初次访问
                }
            }
        }
        return  lazy;
    };
}
