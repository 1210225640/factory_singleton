import com.vip.parrent.singleton.lazy.LazyDoubleCheckSimpleSingleton;
import com.vip.parrent.singleton.lazy.LazyInnerClassSingleton;
import com.vip.parrent.singleton.lazy.LazySimpleSingleton;
import com.vip.parrent.singleton.thread.ThreadLocalSingleton;

/**
 * 2019/5/11
 * Creator:编程浪子
 */

public class ExectorTread implements Runnable {

    public void run() {

       // LazyInnerClassSingleton singleton=LazyInnerClassSingleton.getInstance();
        //LazyDoubleCheckSimpleSingleton singleton=LazyDoubleCheckSimpleSingleton.getInstance();
        LazySimpleSingleton  singleton=LazySimpleSingleton.getInstance();

       // ThreadLocalSingleton  singleton=ThreadLocalSingleton.getInstance();
        System.out.println(Thread.currentThread().getName()+":"+singleton);

    }
}
