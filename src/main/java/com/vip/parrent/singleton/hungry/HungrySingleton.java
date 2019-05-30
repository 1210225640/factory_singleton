package com.vip.parrent.singleton.hungry;

/**
 * 2019/5/11
 * Creator:编程浪子
 */

//饿汉式单例模式
public class HungrySingleton {

    private  static  final HungrySingleton hungrySinglton=new HungrySingleton();

    //1.构造方法私有化
    private HungrySingleton(){};

    //2.提供全局访问点，
    public static HungrySingleton getInstance(){

        //实例在类加载的时候产生
        return hungrySinglton;
    }
}
