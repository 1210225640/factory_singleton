package com.vip.parrent.singleton.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 2019/5/12
 * Creator:编程浪子
 */
//容器缓存
public class ContainerSingleton {

    private  ContainerSingleton(){};

    /**声明一个IOC容器，使用concurrentHashMap存储*/
    private  static Map<String,Object> ioc=new ConcurrentHashMap<String, Object>();

    public  static  Object getBean(String className){
        /**
         * concurrentHashMap性能上是安全的，不安全的是我们自己的代码getBean里面
         * 所以加上synchronized关键字
         */
        synchronized (ioc) {
            //如果它没有的话
            if (!ioc.containsKey(className)) {
                Object obj = null;

                try {
                    obj = Class.forName(className).newInstance();
                    ioc.put(className, ioc);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return obj;
            }
            return ioc.get(className);
        }
    }
}
