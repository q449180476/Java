package day03;

import java.util.Scanner;

/**
 * 本类用来测试Switch结构
 * 总结：执行的顺序
 * 1.先拿到表达式的值（a），然后将a的值与case的值一次进行匹配
 * 2.当成功匹配到的case的值后，会执行case后的代码
 * 3.判断此行代码是否有break，如果有，结束执行，如果没有，会继续向后穿透所有case。
 * 4.如果没有匹配到任何的case，只会执行default的代码
 */
public class Test5_Switch {
    public static void main(String[] args) {
        int a= new Scanner(System.in).nextInt();
        switch(a){
            case 0:
                System.out.println("哥哥");break;
            case 1:
                System.out.println("弟弟");break;
            case 2:
                System.out.println("儿子");break;
                default : System.out.println(0);
        }
        /**
         * 总结3：default是保底选项，可加不可加
         * default是如果没有case被匹配到时执行的默认选项
         * 如果在default之前遇到了break，default才不会执行
         */
        String s="Monday";
        switch (s){
            case "Monday":
                System.out.println("星期一吃火锅");
                break;
            case "Tuesday":
                System.out.println("星期二吃水煮鱼");break;
            case "Wedsday":
                System.out.println("星期三吃大米饭");break;
            case "Thursday":
                System.out.println("星期四吃麻辣香锅");break;
            case "Friday":
                System.out.println("星期五吃汤圆");break;
            case "Saturday":
                System.out.println("星期六吃汉堡");break;
            case "Sunday":
                System.out.println("星期日吃满汉全席");break;
            default:
                System.out.println("那天都吃好吃的");
        }
    }
}
