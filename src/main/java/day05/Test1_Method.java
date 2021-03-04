package day05;

/**
 * 本类用于测试方法的基本知识
 */
public class Test1_Method {
    public static void main(String[] args) {
        System.out.println(1);
        method1();
        method2(10);
        System.out.println(2);
    }
    //创建method1（）方法用来测试方法的调用顺序
/*  修饰符     返回值类型  方法名字（方法参数）{方法体}   */
    public static void method1() {
        System.out.println(3);
        System.out.println(4);
        System.out.println(5);
    }
    //创建method2（）方法
/*  修饰符     返回值类型  方法名字（方法参数）{方法体}   */
    public static void method2(int num){
        System.out.println(num*num);
    }
}



