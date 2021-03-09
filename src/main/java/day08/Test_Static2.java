package day08;

/**
 * 本类用于测试静态的调用关系
 */
//总结：
//1.静态资源只能调用静态资源
//2.非静态资源既可以调用静态资源，也可以调用非静态资源
public class Test_Static2 {
}
//1.创建Teacher类
class Teacher{
    //2.定义普通资源
    //2.1定义普通属性
    String name;
    //2.2定义普通方法
    public void tech(){
        /*普通资源能否调用静态资源--可以*/
        System.out.println(age);//普通资源可以调用静态属性
        sleep();//普通资源可以调用静态方法
        System.out.println("正在教学ing...");
    }
    /*Ctrl+0 查看类结构信息*/
    //3.定义静态资源
    //3.1定义静态属性
    static int age;
    //3.2定义静态方法
    public static void eat(){
        System.out.println("扶朕起来，还能干饭");
    }
    public static void sleep(){
        /*静态资源能否调用普通资源--不能*/
        System.out.println("再累也要好好休息哦");
        /*静态资源能否调用静态资源？--可以*/
        System.out.println(age);//静态资源可以调用静态属性
        eat();//静态资源可以调用静态方法
        System.out.println("再累也要好好休息哦");
    }
}
