package own.stu.architecture.highConcurrenceDesignPattern._6_designPattern.singleton;

/**
 * Created by dell on 2017/10/31.
 *
 * 懒加载模式的单例，调用时才会产生实例，此种模式用synchronize 关键字防止并发调用实例时，会有性能的影响。
 */
public class LazySingleton {
    private LazySingleton() {
        System.out.println(" LazySingleton is created");
    }

    private static LazySingleton instance = null;

    public static synchronized LazySingleton getInstance(){
        if(instance == null)
            instance = new LazySingleton();
        return instance;
    }
}
