package day06;

/**
 * 分析手机事物：
 * 属性：品牌 价格 尺寸 颜色
 * 功能：打电话 发短信 点外卖
 */
/*
    在一个java文件中，可以有多个类，但是只能有一个类被public修饰
    并且此类的名字与文件名相同
 */
public class Test1_ClassExec {
    public static void main(String[] args) {
        Phone p=new Phone();
        //6.通过.来完成对象功能的调用
        p.call();
        p.message();
        p.eat();
        //7.通过.来看查看对象的属性值
        System.out.println(p.brand);
        System.out.println(p.size);

        //8.创建第二个对象
        Phone p2=new Phone();
        //9.通过p2对象调用Phone类中的功能
        p2.message();
        p2.call();
        p2.eat();

        //10.给p2的属性设置值
        p2.brand="HUAWEI";
        p2.price=8888.88;
        p2.size=5.6;
        p2.color="中国红";
    }
}

//1.创建手机类

/**
 * 通过关键字class创建手机类--用来描述手机这一类事物--属性+功能
 */
class Phone{
    //2.定义属性
    /*
        通过成员变量来描述属性，位置：类里方法外，无需手动初始化。
     */
    String brand;//品牌
    double price;//价格
    double size;//尺寸
    String color;//颜色
   //3.定义功能
    /*
        通过类的方法来描述功能--修饰符 返回值类型 方法名（参数）{方法体}
     */
    public void call(){
        System.out.println("正在打电话");
    }
    public void message(){
        System.out.println("正在发短信");
    }
    public void eat(){
        System.out.println("正在点外卖");
    }
}