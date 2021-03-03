package day01;

/**
 * Scanner类：
 * 概述：
 *      扫描器。能够解析字符串（String）和基本数据类型的数据
 * 构造方法
 *      public Scanner（InputStream is）：构造一个扫描器对象，从指定输入流中获取数据参数System.in，
 *      对应键盘录入成员方法
 * 成员方法
 *      hasBextXxx（）： 判断是否还有下一个输入项，其中Xxx可能是任意基本数据类型，返回结果为布尔类型
 *      nextXxx（）： 获取下一个输入值，其中Xxx
 * 注意：
 *      在实际开发中，应用的最多最多的方法就是：
 *          nextInt（），接收整数
 *          nextLine（），接收字符串
 */
import java.util.Scanner;
public class Test_Scanner {
    public static void main(String[] args) {
        //创建Scanner类型对象(注意：要导包)
        //System.in：标准的输入流，默认指向键盘
        Scanner sc=new Scanner(System.in);
        //接收整数
//        System.out.println("请录入一个整数");
//        //为了解决（避免）InputMismatchException异常，可以加入一个判断
//        if(sc.hasNextInt()){//判断下一个录入的是否是整数，如果是，结果就是true
//            int num=sc.nextInt();
//            System.out.println(num);
//        }
        //接收字符串类型的数据
        System.out.println("请录入一个字符串：");
//        String str=sc.nextLine();//结束标记是：换行符
//        System.out.println(str);
        String str1=sc.next();//结束标记：空白字符（空格，tab，换行符）
        System.out.println(str1);

    }
}
