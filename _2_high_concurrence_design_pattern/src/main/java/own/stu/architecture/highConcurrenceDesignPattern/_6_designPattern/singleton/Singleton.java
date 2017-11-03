package own.stu.architecture.highConcurrenceDesignPattern._6_designPattern.singleton;

/**
 * Created by dell on 2017/10/31.
 *
 * 此种单例可能会出现问题是：何时控制单例的产生，如果访问 STATUS 变量时，单例会产生。
 *
 */
public class Singleton {

    public static int STATUS = 1;

    private Singleton() {
        System.out.println(" Singleton is created");
    }

    private static Singleton instance = new Singleton();

    public static Singleton getInstance() {
        return instance;
    }
}
