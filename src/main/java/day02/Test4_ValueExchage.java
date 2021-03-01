package day02;
/**
 * 需求：接收用户输入的两个值，假设a=2，b=1，并将这个两个变量的值进行互换
 */
import java.util.Scanner;
public class Test4_ValueExchage {
    //0.创建入口函数main（）--输入main，Alt+/补全代码
    public static void main(String[] args) {
        System.out.println("请输入a的值");
        int a=new Scanner(System.in).nextInt();
        System.out.println("请输入b的值");
        int b=new Scanner(System.in).nextInt();
        //2.查看用户输入的原来的值
        System.out.println("当前a，b的值为："+a+","+b);

        /**
         * 等号右边的值交给等号左边的变量来保存
         */
        /**
         * 值与值斜相对，连成一个圈
         */
        //3.定义第三个变量用来值交换
        int t;
        //t=1；//把数字1交给变量t保存
        t=a;
        a=b;
        b=t;//交换a，b位置
        System.out.println("交换后a，b的值为"+a+","+b);
    }

}
