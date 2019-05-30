import com.vip.parrent.singleton.register.EnumSingleton;
import com.vip.parrent.singleton.seriable.SeriableSingleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

/**
 * 2019/5/11
 * Creator:编程浪子
 */

public class EnumSingletonTest {

//    public static void main(String[] args) {
//        EnumSingleton s1 = null;
//        EnumSingleton s2 = EnumSingleton.getInstance();
//        s2.setData(new Object());
//
//        FileOutputStream fos = null;
//        try {
//            fos = new FileOutputStream("EnumSingleton.obj");
//            ObjectOutputStream oos = new ObjectOutputStream(fos);
//            oos.writeObject(s2);
//            oos.flush();
//            oos.close();
//
//
//            FileInputStream fis = new FileInputStream("EnumSingleton.obj");
//            ObjectInputStream ois = new ObjectInputStream(fis);
//            s1 = (EnumSingleton)ois.readObject();
//            ois.close();
//
//            System.out.println(s1.getData());
//            System.out.println(s2.getData());
//            System.out.println(s1.getData() == s2.getData());
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }

    public static void main(String[] args) {
        try {
            Class  clazz=EnumSingleton.class;
            Constructor c=clazz.getDeclaredConstructor(String.class,int.class);
            c.setAccessible(true); //暴力强吻
           EnumSingleton obj= (EnumSingleton)c.newInstance("demo",888);
            System.out.println(obj);

            //从JDK层面就为枚举不被序列化
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
