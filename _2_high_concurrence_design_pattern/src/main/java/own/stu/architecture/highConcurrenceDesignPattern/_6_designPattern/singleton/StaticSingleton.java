package own.stu.architecture.highConcurrenceDesignPattern._6_designPattern.singleton;

/**
 * Created by dell on 2017/10/31.
 *
 * 使用静态内部类，生成静态实例。
 */
public class StaticSingleton {
    private StaticSingleton() {
    }

    private static class SingletonHolder{
        private static StaticSingleton instance = new StaticSingleton();
    }

    public static StaticSingleton getInstance(){
        return SingletonHolder.instance;
    }
}
