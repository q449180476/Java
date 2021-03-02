package day03;

import java.util.Scanner;

/**
 * 需求：接收用户输入的两个整数，并比较输出这两个数的最大值
 */
public class Test2_MaxNum {
    public static void main(String[] args) {
        //1.提示用户输入
        System.out.println("请输入您要比较的第一个整数：");
        //2.接收用户输入的整数，并把这个值交给变量a来保存
        int a=new Scanner(System.in).nextInt();
        System.out.println("请输入您要比较的第二个整数：");
        int b=new Scanner(System.in).nextInt();

        //3.比较接收两个数，使用三元运算符
        /**
         * 1？2:3
         * 1是表达式，若1的结果为true，结果取2位置，若1的结果为false，结果取3位置
         */
        int max;//定义变量max来保存比较的最大值
        max=a>b?a:b;
        System.out.println(max);

    }
}
