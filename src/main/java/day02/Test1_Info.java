package day02;
/**
 *需求：在控制台打印
 *java架构师xxx今年xxx岁，月薪xxx，感慨java是世界上最好的语言
 **/
public class Test1_Info {
    //1.创建程序的入口函数
    public static void main(String[] args) {
        /**1.我们程序当中的（）【】{}“”‘’都是成对出现的，而且都是英文符号*/
        /**2.一串数据，在java中是字符串类型--String
         *	字符串类型的数据，要被一对双引号引起来
         */
        System.out.println(" 欢迎来到Java世界，可爱的程序猿萌");

        /**3.定义变量的规则，数据类型 变量名 变量值*/
        String name="王浚合";
        int age=23;
        double salary=10000.00;

        /**4.把静态数据和动态数据分开，通过+实现数据的动态拼接*/
        System.out.println("java架构师"+name+"今年"+age+"岁，月薪"+salary+"，感慨java是世界上最好的语言");
    }
}
