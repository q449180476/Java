package day07;

public class Test5_ExtendsDemo {
    public static void main(String[] args) {
        Cat c=new Cat();
        c.eat();
        DingDang dingDang=new DingDang();
        dingDang.eat();
    }

}

/**
 * 子类与父类是继承关系，用extends关键字来建立关系
 * Java只支持单继承，一个子类只能有一个父类，一个父类可以有多个子类
 */
//1.创建动物类Animal
class Animal{

}
//2.创建小猫类Cat
class Cat extends Animal{
    public void eat(){

    }
    int a=10;
    private int b=200;//父类的私有资源，子类不能继承
}

/**
 * 3.子类继承父类以后，相当于把父类的功能进行了复制
 * 4.继承具有传递性，爷爷的功能会传给爸爸，爸爸的功能会传给儿子
 * 6.继承是is a 的关系，要求子类必须是父类的一种继承结构，依赖性非常强，强耦合
 */
//3.创建DingDang类继承Cat类
class DingDang extends Cat{

}
