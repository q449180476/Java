package day08;

/**
 * 本类用于完成汽车设计综合案例
 */
/**
 * 分析:
 * 提取共性:生成汽车父类
 * 方法:启动方法 停止方法
 * 属性: 品牌 颜色
 *具体事物:宝马汽车 奥迪汽车--继承汽车父类,子类享有父类的公有属性和方法
 * */
public class Test7_ExtendsDesignCar {
    public static void main(String[] args) {

//3.创建父类对象进行初步测试
        Car c = new Car();
        c.run();
        c.stop();

//4.创建子类对象进行初步测试
        BMW c1 = new BMW();
        c1.run();
        c1.stop();
        Audi c2 = new Audi();
        c2.run();
        c2.stop();
    }
}

//0.抽取宝马类与奥迪类的共性,生成汽车父类

class Car {
    //定义特征--属性/成员变量
    String bround;//汽车品牌
    String color;//汽车颜色
//定义行为--功能/成员方法
    public void run() {
        System.out.println("汽车启动....");
    }
    public void stop() {
        System.out.println("汽车停止....");
    }
}
//1.创建一个宝马类
//1.1继承汽车类,继承后,子类就具有父类的公有属性和功能了
class BMW extends Car {
//5.如果想要修改父类的原有功能--方法的重写
//5.1重写后,父类原有的功能并没有被修改,改的是子类自己的功能
    public void run() {
        //5.2super应用在子类中,表示父类对象的引用Car super = new Car();
        super.run();
        System.out.println("汽车启动加速度UP UP UP....");
    }
}
//2.创建一个奥迪类
//2.1继承汽车类,继承后,子类就具有父类的公有属性和功能了
class Audi extends Car {
    public void stop() {
        System.out.println("汽车停止....要停的稳当一些哦~");
    }
}
