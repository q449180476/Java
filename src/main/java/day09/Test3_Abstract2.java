package day09;

/**
 * 本类用于测试抽象类中构造函数的用法
 * 总结：
 * 1.抽象类中可以有构造方法
 * 2.父类的构造方法要优先于子类执行
 * 3.抽象类不可以创建对象(实例化)
 * 4.抽象类中存在的构造方法不是为了创建本类对象时调用
 * 而是为了创建子类对象时使用
 */
public class Test3_Abstract2 {

}
//1.创建抽象父类Animal3
abstract class Animal3{
    public Animal3(){
        //如果此处传参磨人的无参构造会被覆盖
        //子类super()就报错了
        System.out.println("我是animal3的构造方法");
    }
}

//2.创建子类
class Pig3 extends Animal3{
    //6.创建子类无惨构造，无惨构造默认存在
    public Pig3(){
        super();//隐藏着super()，先访问父类的构造方法，再执行子类的构造方法
        System.out.println("我是pig3的构造方法");
    }
}
