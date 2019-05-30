package com.vip.parrent.singleton.register;

/**
 * 2019/5/11
 * Creator:编程浪子
 */
//注册式单例
    //使用枚举
public enum  EnumSingleton {

    INSTANCE;

    private  Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public  static  EnumSingleton getInstance(){
        return INSTANCE;
    };

}
