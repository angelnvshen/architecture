package own.stu.architecture.highConcurrenceDesignPattern._6_designPattern.immutable;

/**
 * Created by dell on 2017/10/31.
 */
public final class Product {//确保无子类
    private final String no;

    //私有属性，不会被其他对象获取
    private final String name;

    //final保证属性不会被2次赋值
    private final double price;

    public Product(String no, String name, double price) {
        this.no = no;
        this.name = name;
        this.price = price;
    }

    public String getNo() {
        return no;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
