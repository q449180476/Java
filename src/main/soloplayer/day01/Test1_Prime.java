package day01;

import java.util.Scanner;

/**
 * 需求：判断输入的数是否为质数
 */
public class Test1_Prime {
    public static void main(String[] args) {
        /*质数需要满足的条件：它大于1，而且是除了1和它自身外，不能被其他自然数整除的数。*/
        System.out.println("请输入自然数来判断是不是质数");
        int Prime=new Scanner(System.in).nextInt();
        String name="不是质数";
        if(Prime>1) {
            for (int i = 2; i < Prime; i++) {
                if (Prime % i == 0) {
                    name = "是质数";
                    break;
                }
            }
            System.out.println(name);
        }else{
            System.out.println("输入不合法");
        }
    }
}
