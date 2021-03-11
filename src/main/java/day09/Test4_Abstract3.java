package day09;

/**
 * 本类用于测试抽象类中的成员
 */
public class Test4_Abstract3 {
    public static void main(String[] args) {
        //7.创建多态对象进行测试
        Fruit f=new Apple();
        f.eat();
        f.clean();
    }
}

//1.创建抽象父类--水果类
abstract class Fruit{
    //抽象类中可以有成员变量吗
    //3.1创建抽象父类成员变量
    int sum=10;
    final String name="yyds";
    /*
        3.抽象类中可以有普通方法吗？--可以！！！
        抽象类中可以都是普通方法吗？--可以！！！
     */
    /*
        4.如果一个类中都是普通方法，为啥还要被声明成抽象类呢？
        原因：抽象类不可以创建对象
        如果不想让外界创建本类对象，可以吧普通类声明成抽象类
     */
    public void eat(){
        System.out.println("吃啥水果都行");
    }
    //5.创建抽象父类中的抽象方法
    /*
        5.抽象类中可以有抽象方法
        一旦类中有抽象方法，这个类必须被声明成一个抽象类
     */
    public abstract void clean();
}


/*
    6.当一个类继承了父类，并且父类是抽象父类时
    子类需要重写(实现)父类中的所有抽象方法或者把自己变成抽象子类
 */
//2.创建子类--苹果类
//解决方法一：把自己变成一个抽象子类
//解决方法二：重写父类中的所有抽象子类
class Apple extends Fruit{
    @Override
    public void eat() {
        System.out.println("水果中最爱吃苹果");
    }
    @Override//注解，相当于标记，标记了这个方法是一个重写的方法
    public void clean() {
        System.out.println("苹果还是要好好洗洗再吃");
    }
}