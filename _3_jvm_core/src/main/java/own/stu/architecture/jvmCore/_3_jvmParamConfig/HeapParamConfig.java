package own.stu.architecture.jvmCore._3_jvmParamConfig;

/**
 * Created by dell on 2017/11/3.
 *
 * 堆的参数分配
 *
 */
public class HeapParamConfig {

    public static void main(String[] args) {
//        heapParamConfig();
        heapParamConfigWithUse();
    }

    /**
      * output:
        Xmx = 18.0M
        free mem = 3.5039215087890625M
        total mem = 5.5M
     *
     */
    public static void heapParamConfigWithUse(){
        byte[] b = new byte[1024*1024];
        System.out.println("分配了1M空间给数组");
        heapParamConfig();
    }

    /**
     * -Xmx20m -Xms5m
     *
     * output:
     *
        Xmx = 18.0M
        free mem = 4.503997802734375M
        total mem = 5.5M
     *
     */
    public static void heapParamConfig(){
        System.out.print("Xmx = ");
        System.out.println(Runtime.getRuntime().maxMemory()/1024.0/1024 + "M");

        System.out.print("free mem = ");
        System.out.println(Runtime.getRuntime().freeMemory()/1024.0/1024 + "M");

        System.out.print("total mem = ");
        System.out.println(Runtime.getRuntime().totalMemory()/1024.0/1024 + "M");
    }
}
