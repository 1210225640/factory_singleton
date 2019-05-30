import com.vip.parrent.singleton.thread.ThreadLocalSingleton;

/**
 * @Data:2019/5/27 21:34
 * @Author:Dream
 */

public class ThreadLocalSingletonTest {

    public static void main(String[] args) {
        System.out.println(Thread.currentThread());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());

        Thread  t1=new Thread(new ExectorTread());

        Thread  t2=new Thread(new ExectorTread());

        t1.start();
        t2.start();

        System.out.println("End");
    }
}
