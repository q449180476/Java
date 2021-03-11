package day09;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int a= new Scanner(System.in).nextInt();
        System.out.println(f(a));
    }

    public static int f(int n) {
        if (n==1){//最简问题
            return 1;
        }else{//其他情况n*f（n-1）
            //递归：再方法内部自己调用自己
            return n*f(n-1);
        }
    }
}
