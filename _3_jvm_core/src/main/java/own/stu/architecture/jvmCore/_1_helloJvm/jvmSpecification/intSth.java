package own.stu.architecture.jvmCore._1_helloJvm.jvmSpecification;

/**
 * Created by dell on 2017/11/2.
 */
public class intSth {

    public static void main(String[] args) {
//        intToBinaryPrint();
//        intToHexPrint();
//        byteToBinaryPrint();
//        byteToHexPrint();

        intToBinaryByHand();
        System.out.println();
        System.out.println(Integer.toBinaryString(-99));
    }

    /**
     *int 类型，打印成二进制数据
     *
     * 二进制表示的是 int类型的补码（反码+1）。
     *
     */
    public static void intToBinaryPrint(){
//        int iValue = 5;
        int iValue = -5;
        String binaryString  = Integer.toBinaryString(iValue);
        System.out.println(binaryString);
    }

    /**
     *int 类型，打印成16进制数据
     *
     * 16进制表示的是 对应的二进制转化成16进制。
     *
     */
    public static void intToHexPrint(){
//        int iValue = 5;
        int iValue = -5;
        String binaryString  = Integer.toHexString(iValue);
        System.out.println(binaryString);
    }

    /**
     *byte 类型，打印成二进制数据
     */
    public static void byteToBinaryPrint(){

        byte iValue = -5;
        String binaryString  = Integer.toBinaryString(iValue);
        System.out.println(iValue);
        System.out.println(binaryString);
    }

    /**
     *byte 类型，打印成16进制数据
     */
    public static void byteToHexPrint(){

//        byte iValue = 5;
        byte iValue = -5;
        String binaryString  = Integer.toHexString(iValue);
        System.out.println(binaryString);
    }

    /**
     *
     * 0x80000000是数的十六进制表示，转成二进制表示为10000000000000000000000000000000
     * 运算的优先级，移位运算高于逻辑运算，>>>高于&
     * 位逻辑与运算 1&1 = 1 ，0&1 = 0
     * >>>无符号右移，移出部分舍弃，左边位补0；
     *
     */
    public static void intToBinaryByHand() {

        /*
        根据循环过程可以看出
        (0x80000000 >>> i)的作用是mask，每次循环都与a做逻辑与操作，取a的第i位；
        对上条结果>>> 31 - i作用是把取出的a的第i位移到最末位。
         */
        int a = -99;
        for (int i = 0; i < 32; i++) {
            int t = (a & 0x80000000 >>> i) >>> (31 - i);
            System.out.print(t);
        }
    }

}
