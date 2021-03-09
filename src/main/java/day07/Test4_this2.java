package day07;

/**
 * 本类用来测试this
 */
public class Test4_this2 {
    //5.创建程序的入口函数
    public static void main(String[] args) {
        //6.创建对象进行测试
        Dog dog=new Dog();
        Dog d2=new Dog("旺财");
        dog.name="UTF-8";

    }
}

/**
 * this可以用来进行构造方法之间的调用
 * 但是注意！！！调用是单向的，不是双向来回调用，会死循环
 */

//1.创建小狗类Dog
class Dog{
    //2.定义属性name
    String name;
    //3.提供无参构造
    public Dog(){
        /*
            在无参构造中调用含参构造的功能
            规定：this关键字必须在构造方法中的第一行
         */
        this("旺旺");
        System.out.println("无参构造");
    }
    //4.提供含参构造
    public Dog(String s){
        //this();
        System.out.println("含参构造");
    }

        }

