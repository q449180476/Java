package day09;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 本类用于测试异常的入门案例
 * 总结8：
 * 如果方法抛出异常，name谁调用，谁需要解决（继续）
 * 所以main()调用了method2(),如果main()不捕获处理，就也需要抛出异常
 * 注意：我们一般在main()调用之前捕获解决异常，而不是把问题抛给main(),因为没人解决了
 */
public class Test1_ExceptionDemo {
    //1.创建入口函数main方法
    public static void main(String[] args) throws Exception{
          //  method();//调用method（）
        //method1();
        method2();
    }

    //4.创建method2（），练习BUG解决方法二
    /**
     * 抛出的语法规则：
     * 在可能会出现异常的方法上加throws异常类型
     * 在抛出时，也可以使用多态，不管是发生了什么异常，通通被Exception抛出去
     */
    private static void method2() throws Exception {
        System.out.println("请输入您要计算的第一个数：");
        int a = new Scanner(System.in).nextInt();
        System.out.println("请输入您要计算的第二个数：");
        int b = new Scanner(System.in).nextInt();
        System.out.println(a / b);
    }

    //3.创建method1（），联系BUG解决方案一
    /**
     * 捕获的语法规则：
     * try{
     *     可能会出现异常的代码
     * }catch(异常的类型和异常的名字){
     *     如果捕获到对应异常的解决方案
     * }
     */
    public static void method1() {
        //3.1按照学习的捕获语法
        try {
            //3.2复写刚刚可能会发生异常的代码
            System.out.println("请输入您要计算的第一个数：");
            int a = new Scanner(System.in).nextInt();
            System.out.println("请输入您要计算的第二个数：");
            int b = new Scanner(System.in).nextInt();
            System.out.println(a / b);
        }catch (InputMismatchException e){
            //总结5：如果发生异常被捕获，就执行此处被匹配到的解决方案
            System.out.println("nmsl？不好好输");
        }catch(ArithmeticException e){
            //总结6：由于程序中国可能出现多种异常，所以catch可以配合多次使用
            System.out.println("除数输nm的0呢");
            /**
             * 总结7：如果还有上述两种异常之外的异常，用Exception匹配捕获
             * 这个就是多态最为经典的一种用法，我们不关心子类的子类
             * 只要是可解决的异常，都是Exception的子类，多态会把这些异常当做父类型来看
             * 进而捕获，使用通用异常解决方案来解决
             */
        }catch (Exception e){
            System.out.println("mm没了？瞎鸡儿输");
        }
    }

    //2.创建method（）用来人为暴露异常
    public static void method() {
        //2.1提示并接收用户输入的两个整数
        System.out.println("请输入您要计算的第一个数：");
        int a=new Scanner(System.in).nextInt();
        System.out.println("请输入您要计算的第二个数：");
        int b=new Scanner(System.in).nextInt();
        //2.2输出除法运算的结果
        //输入8 2.2，报错：InputMismatchException[输入类型不匹配]
        //输入9和0，报错：ArithmeticException/by zero[算数异常，除数不能为0]
        System.out.println(a/b);

        /*
            1.不要害怕BUG，真正的勇士敢于直面自己写的BUG。
            2.学会看报错信息的错误提示，确定自己错误的放向。
            3.学会看报错信息的行号提示，哪里报错点哪里，源码不会错，要看的是自己写的
         */
    }
}
