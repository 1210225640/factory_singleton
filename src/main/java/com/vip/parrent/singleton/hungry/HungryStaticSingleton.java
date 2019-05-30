package com.vip.parrent.singleton.hungry;

/**
 * 2019/5/11
 * @author:编程浪子
 */

/**饿汉式单例模式
    //在单例类首次加载的时候就创建实例
    //缺点：浪费内存空间
 * @author ASUS
 */
public class HungryStaticSingleton {

    /**加final的含义是为了避免通过反射改变该实例对象*/
    private  static  final HungryStaticSingleton hungrySinglton;

    //不管是静态类还是静态代码块都会在类加载的时候初始化
    static {
        hungrySinglton=new HungryStaticSingleton();
    }

    /**1.构造方法私有化*/
    private HungryStaticSingleton(){};

    /**2.提供全局访问点*/
    public static HungryStaticSingleton getInstance(){

        //实例在类加载的时候产生
        return hungrySinglton;
    }
}
