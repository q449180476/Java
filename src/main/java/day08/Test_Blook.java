package day08;

/**
 * 本类用于测试代码块之间的关系
 * 总结：
 * 1.代码之间的执行顺序：
 * 静态代码块-->构造代码块-->构造方法-->局部代码块
 * 2.为什么是这样的顺序?
 *
 */
public class Test_Blook {
    public static void main(String[] args) {
        //7.创建对象进行测试
        /*
            1.在创建对象之前，会自动执行静态代码块，而且此代码块之家在一次
            2.在创建对象时，会自动调用构造代码块和构造方法，构造代码块先执行
            3.当通过对象调用方法时，若方法里有局部代码块，局部代码块才会执行
         */
        Person p=new Person();
        p.study();
        System.out.println("*********我是一个无情的分界线*********");
        Person p2=new Person();//再去创建对象，静态代码块也不会再次加载了
    }
}

//1.创建Person类
class Person{
    //2.创建静态代码块
    /*
        静态代码块：
        位置：类里方法外+触发节点：随着类的加载而加载，只加载一次
     */
    static{
        System.out.println("我是静态代码块");
    }
    //3.创建构造代码块
    /*
        构造代码块：
        位置：类里方法外+触发节点：创建对象时立即执行
     */
    {
        System.out.println("我是构造代码块");
    }
    //4.创建构造方法
      /*
        构造方法：
        位置：类里方法外+触发节点：
     */
    public Person(){
        System.out.println("我是构造方法");
    }
    //5.创建普通方法
    public void study(){
        System.out.println("我是普通方法");
        //6.创建局部代码块
        {
            /*
                局部代码块：
                位置：方法里+触发节点：调用此方法时执行
             */
            System.out.println("我是局部代码块");
        }
    }
}
