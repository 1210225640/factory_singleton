import com.vip.parrent.singleton.lazy.LazySimpleSingleton;

/**
 * 2019/5/11
 * Creator:编程浪子
 */
//测试懒汉式单利写法
public class LazySimpleSingletonTest {

    public static  void  main(String[] args){

  //      LazySimpleSingleton.getInstance();
        //创建线程
        Thread t1=new Thread(new ExectorTread());
        Thread t2=new Thread(new ExectorTread());

        //启动线程
        t1.start();
        t2.start();

        //打印输出语句
        System.out.println("Exectory End");
    }
}
