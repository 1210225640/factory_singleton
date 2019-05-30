package com.vip.parrent.singleton.lazy;

/**
 * 2019/5/11
 * Creator:编程浪子
 */

//通过静态内部类去实现,全程没有用到synchronized
    //性能最优的写法
public class LazyInnerClassSingleton {

    //虽然构造方法私有了，但是逃不过反射的法眼
    private LazyInnerClassSingleton(){
        if (LazyHolder.lazy !=null){
            throw  new RuntimeException("不允许构建多个实例");
        }
    };

    //懒汉式单例
    //LazyHolder里面的逻辑需要等到外部方法调用时才执行
    //巧妙的利用了内部类的特性
    //JVM底层执行逻辑，完美的避免了线程安全问题
    public  static  final  LazyInnerClassSingleton getInstance(){
        return LazyHolder.lazy;
    }

    private static  class LazyHolder{
        private  static  final  LazyInnerClassSingleton lazy=new LazyInnerClassSingleton();
    }

}
