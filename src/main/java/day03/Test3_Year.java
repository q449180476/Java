package day03;

import java.util.Scanner;

/**
 * 需求：接收用户输入的年份，判断是平年还是润年
 * 如果年份是闰年，需要满足下面两个条件之一：
 * 条件1：能被4整除，并且不能被100整除
 * 条件2：能被400整除
 */
public class Test3_Year {
    public static void main(String[] args) {
        //1.提示并接收用户输入的年份
        System.out.println("请输入您要判断的年份：");
        int year = new Scanner(System.in).nextInt();
        //2.定义一个变量用来保存结果
        String result = "平年";//默认值是平年，假设每年都是平年
        //3.判断用户输入的年份是否满足闰年的条件
        /**
         * 判断if（判断条件）{满足判断条件以后执行的代码}
         * 条件1：能被4整除，并且不能被100整除
         */
//        if (year % 4 == 0) {//能被4整除
//            if (year % 100 != 0) {//不能被100整除
//                result = "闰年";
//            }
//        }
        /**条件2：能被400整除*/
//        if (year % 400 == 0) {//能被400整除
//            result = "闰年";//符合闰年的条件2，修改结果为闰年
//
//        }
        if((year%4==0&&year%100!=0)||year%400==0) {
            result="闰年";
        }
        System.out.println(year + "年是" + result);
    }
}
