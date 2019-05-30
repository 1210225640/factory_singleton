import com.vip.parrent.singleton.register.ContainerSingleton;

/**
 * 2019/5/18
 * Creator:编程浪子
 */


public class ContainerSingletonTest {

    public static void main(String[] args) {
        //模拟并发
        try {
            ConcurrentExecutor.execute(new ConcurrentExecutor.RunHandler() {
                public void handler() {
                    Object obj = ContainerSingleton.getBean("Pojo");
                    System.out.println(System.currentTimeMillis()+":"+obj);
                }
            }, 10, 6);

            //对象方便管理，其实也是属于懒加载
            //存在线程安全问题
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}

