package day07;

/**
 * 本类用于测试继承中成员变量的使用
 */
public class Test6_Extends1 {
    public static void main(String[] args) {
        Son s=new Son();
        s.eat();
    }
}

//1.创建父类
class Father{
    //7.定义两个属性
    int count=0;
    int sum=300;
}

//2.创建子类
class Son extends Father {
    //4.2定义子类的成员变量
    int sum=100;
    /**1*/
    //3.创建子类的普通方法
    public void eat(){
        //4.1创建子类的局部变量：
        int sum=10;
        /**
         * 在子类中使用父类的资源sum，需要使用关键字super指定
         * super是表示父类的一个引用，可以理解成：
         * Father super =new Father;
         */
        System.out.println(sum);//打印局部变量sum
        System.out.println(this.sum);//打印成员变量
        System.out.println(count);
        System.out.println(super.sum);
    }
}