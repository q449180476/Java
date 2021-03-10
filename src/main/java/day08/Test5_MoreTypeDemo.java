package day08;

/**
 * 本类用于测试多态入门案例
 */
public class Test5_MoreTypeDemo {
    public static void main(String[] args) {
        //5.创建父类对象进行测试
        Animal a = new Animal();
        a.eat();//小动物Animal吃啥都行~~~~
//a.jump();//父类无法使用子类的特有方法:The method jump() is undefined for the type Animal
//6.创建子类对象进行测试
        Cat c = new Cat();
        c.eat();//小猫cat爱吃小鱼干~~~--调用重写后的功能
        c.jump();
        //!!!!!8.创建多态对象进行测试
/**口诀1: 父类引用 指向 子类对象*/
/**口诀2: 编译(保存)看左边,运行(测试)看右边*/
        Animal a2 = new Cat();
//eat()是使用的父类的声明,但是使用的是子类的实现方式
        a2.eat();//小猫cat爱吃小鱼干~~~
/**多态的出现:是为了统一调用标准,向父类看齐,父类提供的功能才能用,子类特有的功能用不了*/
//a2.jump();//The method jump() is undefined for the type Animal
    }
}

//1.创建父类
class Animal {
    //3.定义父类中的成员方法
    public void eat() {
        System.out.println("小动物Animal吃啥都行~~~~");
    }
}

//2.创建子类
class Cat extends Animal {
//4.重写父类中的方法--对父类的代码进行功能修改
//重写: 方法签名保持一致(返回值类型 方法名(参数列表) ) & 权限修饰符>=父类权限修饰符
    public void eat() {
        System.out.println("小猫cat爱吃小鱼干~~~");
    }

    //7.定义子类特有的方法
    public void jump() {
        System.out.println("小猫Cat跳的老高了!!");
    }
}