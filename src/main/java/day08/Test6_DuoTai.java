package day08;

/**
 * 本类用于测试多态之成员变量的使用
 */

public class Test6_DuoTai {
    public static void main(String[] args) {

//3.创建子类对象进行测试
        Dog d = new Dog();
        System.out.println(d.sum);//20
        d.eat();
        d.play();
//4.创建多态对象进行测试

/*2.父类引用指向子类对象
3.编译看左边,能用的功能必须都是父类提供的
总结1:多态中,成员变量使用的都是父类的*/
        Animals a = new Dog();
        System.out.println(a.sum);//10
//总结2:多态中,成员方法使用的是父类的方法声明,子类的方法体(方法实现)
        a.eat();
        a.play();//玩啥都行
    }
}
//1.创建父类与成员变量
class Animals {
    int sum = 10;
    //5.1创建父类的成员方法
    public void eat() {
        System.out.println("吃啥都行");
    }

//6.1在父类创建一个静态play方法
    static public void play() {
        System.out.println("玩啥都行");
    }
}

/**
 * 1.多态的前提:继承+重写
 */

//2.创建子类与成员变量
class Dog extends Animals {
    int sum = 20;
    //5.2在子类中重写父类的eat()
    public void eat() {
        System.out.println("小狗要吃肉骨头~");
    }

//6.2在子类中创建一个静态play方法
    /**
     * 注意!!!静态资源属于类,不存在重写现象,只是两个类中有同样声明的方法而已,不属于重写
     */
    static public void play() {
        System.out.println("小狗爱打滚");
    }
}