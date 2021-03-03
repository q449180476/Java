package day04;

import java.util.Scanner;

public class Test4_BreakContinue {
    public static void main(String[] args) {
        for (int i=1;i<=100;i++){
            System.out.println("请输入你猜的数字");
            int a=new Scanner(System.in).nextInt();
            if (a!=88){
                System.out.println("再来！");
                continue;/**continue和break后不可以写代码，都是不可到达的代码*/
            }else{
                System.out.println("猜对了！");
                break;
            }
        }
    }
}
