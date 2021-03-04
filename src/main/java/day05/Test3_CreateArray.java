package day05;

import java.util.Arrays;

public class Test3_CreateArray {
    public static void main(String[] args) {

        int[] c1={1,2,3};

        //打印显示穿件好的数组
        System.out.println(c1);

        //创建String类型的数组s，存“a”，“b”，“c”
        /**
         * char类型底层做的处理，可以直接打印数组中的内容
         * 除了char类型以外的所有数组想要查看数组中的具体元素
         * 需要使用数组工具类Arrays的toString（数组名）方法
         */
        String[] s={"a","b","c"};
        System.out.println(Arrays.toString(s));

        //查看数组的长度
        System.out.println(c1.length);
    }
}
