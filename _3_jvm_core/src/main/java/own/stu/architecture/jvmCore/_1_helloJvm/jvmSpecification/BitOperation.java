package own.stu.architecture.jvmCore._1_helloJvm.jvmSpecification;

/**
 * Created by dell on 2017/11/2.
 *
 *  位运算符主要针对两个二进制数的位进行逻辑运算
 */
public class BitOperation {

    public static void main(String[] args) {
//        andOperate();
//        inclusiveOR();
//        exclusiveOR();
//        notOperation();

        System.out.println(Integer.toBinaryString(-1));
    }

    /**
     *  & 运算
     *
     *  两个操作数中位都为1，结果才为1，否则结果为0
     *
     */
    public static void andOperate(){
        int a = 128;
        int b = 129;
        //“a”的值是129，转换成二进制就是10000001，而“b”的值是128，转换成二进制就是10000000。根据与运算符的运算规律，只有两个位都是1，结果才是1，可以知道结果就是10000000，即128。
        System.out.println(a&b);
    }

    /**
     *  | 运算
     *
     *  两个位只要有一个为1，那么结果就是1，否则就为0
     */
    public static void inclusiveOR(){
        int a = 128;
        int b = 129;

        //a 的值是129，转换成二进制就是10000001，而b 的值是128，转换成二进制就是10000000，根据或运算符的运算规律，只有两个位有一个是1，结果才是1，可以知道结果就是10000001，即129
        System.out.println(a|b);
    }

    /**
     *  ^ 运算
     *
     *  两个操作数的位中，相同则结果为0，不同则结果为1。
     */
    public static void exclusiveOR(){
        int a=15;
        int b=2;

        //分析上面的程序段：a 的值是15，转换成二进制为1111，而b 的值是2，转换成二进制为0010，根据异或的运算规律，可以得出其结果为1101 即13
        System.out.println(a^b);
    }

    /**
     *  ~ 运算
     *
     *  如果位为0，结果是1，如果位为1，结果是0
     */
    public static void notOperation(){
        int a=15;

        /**
         * 假设有一个数~9，计算步骤如下，9的二进制为：1001
            其补码为01001
            对其取反10110（“~”运算符取反后得到这个数），现在需要换成二进制原码用来输出，既先减1，然后取反得11010，符号位为1是负数，
            既9使用了按位运算符“~”后得到-10。
         *
         */
        System.out.println(~a);
    }

}
