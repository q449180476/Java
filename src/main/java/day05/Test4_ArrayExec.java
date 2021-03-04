package day05;

import java.util.Arrays;

/**
 * 本类用于练习数组的遍历
 * 续求：输出一年中12个月份对应的天数
 */
public class Test4_ArrayExec {
    public static void main(String[] args) {
        //调用m（）
        m();//本方法用于输出每个月的天数
    }

    public static void m() {
        //创建数组a用来保存12个月的天数
        int[] a={31,28,31,30,31,30,31,31,30,31,30,31};
        /*
            输出每个月的天数，格式：1月有31天
            数组的遍历-通过循环结构-for-由于数组的长度是固定的，
            我们通过数组下标操作数组
            初始值：a[0]--数组的第一个元素
            结束值：a[a.length-1]--数组中的最后一个元素
         */
        for (int i=0;i<a.length;i++){
            System.out.println(i+1+"月有"+a[i]+"天");
        }
    }
}
