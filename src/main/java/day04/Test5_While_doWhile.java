package day04;

import java.util.Random;
import java.util.Scanner;

public class Test5_While_doWhile {
    public static void main(String[] args) {
        int random=Demo.f1();
        System.out.println("打个小抄"+random);//记录random生成值是多少
        System.out.println("猜猜看");
        int put = new Scanner(System.in).nextInt();
        do {
            //判断用户输入值与随机生成值的大小关系
            if (put > random) {
                System.out.println("输大啦!");
                } else if (put < random) {
                    System.out.println("输小啦");
                } else {
                    System.out.println("猜对啦！");
                    break;
                }
            }while (true);
    }
}
