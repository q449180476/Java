package day04;

import java.util.Random;

public class Demo {
    public static void main(String[] args) {
        f1();
    }

    //方法的定义
//  修饰符  返回值类型 方法名（方法参数）{方法体}
    public  static   int  f1(){
        //生成一个随机数[0,100）
        int r=new Random().nextInt(100);
        return r;

    }
}
