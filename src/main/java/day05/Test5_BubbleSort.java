package day05;

import java.util.Arrays;

public class Test5_BubbleSort {
    public static void main(String[] args) {
    int[] a={27,96,73,25,21};
    int[] newA=f(a);
    System.out.println("排序完毕："+Arrays.toString(newA));
    }

    private static int[] f(int[] a) {
        for (int i=1;i<=a.length;i++){
            //2.内层循环是控制每轮中相邻比较+互换位置
            for (int j=0;j<a.length-1;j++){
                if (a[j]>a[j+1]){
                   int b=a[j];
                    a[j]=a[j+1];
                    a[j+1]=b;
                }
            }
        }
        return a;//把排好序的数组a返回
    }
}

