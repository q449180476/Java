package day05;

/**
 * 本类用于测试方法的重载
 */
public class Test2_MethodOverload {
    public static void main(String[] args) {
        //重载：在同一个类中，有多个同名&参数列表不同的方法
        //参数列表指的是参数的类型顺序和个数，而不是参数名
        //（int i）和（String s）
        //（int a，int b）和（int b，int a）--不是重载
        //（int a，String b）和（String 啊，int b）--是重载
        f();
        f(10);
        f("派大星",8);
        /*
            调用方法是根据方法名+参数列表来调用的
         */
    }

    public static void f(String name, int i) {
        System.out.println(name+i);
    }

    public static void f(){
        System.out.println("哈哈哈哈我没有参数");
    }
    public static void f(int a){
        System.out.println("哈哈哈哈我有参数");
    }
}
