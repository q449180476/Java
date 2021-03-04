package day05;

import java.util.Arrays;

public class Test6_ArraySort {
    public static void main(String[] args) {
        m();//本方法用来测试sort（）与toString
        m2();//本方法用来测试copyof()

    }

    private static void m2() {
        int[] a = {27, 96, 73, 25, 21};
        //数组的普通复制
        /**
         * 第一个参数是要操作哪个数组
         * 第二个参数使你指定的新数组长度
         */
        int[] from=Arrays.copyOf(a,10);
        System.out.println(Arrays.toString(from));
    }


    private static void m() {
        int[] a = {27, 96, 73, 25, 21};
        //底层使用的是优化后的快速排序算法
        Arrays.sort(a);
        //使用工具类Arrays打印数组中的元素
        System.out.println(Arrays.toString(a));


    }
}
