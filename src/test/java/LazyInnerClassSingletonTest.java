import com.vip.parrent.singleton.lazy.LazyInnerClassSingleton;

import java.lang.reflect.Constructor;


/**
 * 2019/5/11
 * Creator:编程浪子
 */

//通过发射机制，暴力访问私有构造方法
public class LazyInnerClassSingletonTest {

    public static void main(String[] args) {
        try {
            //调用者装逼，不走寻常路，破坏了单例
            Class<?> clazz= LazyInnerClassSingleton.class;

            //获取默认的构造方法
            Constructor c=clazz.getDeclaredConstructor(null);
            c.setAccessible(true);  //暴力强吻

           Object o1= c.newInstance();
           Object o2=LazyInnerClassSingleton.getInstance();//使用单例再创建一个

            System.out.println(o1==o2);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
