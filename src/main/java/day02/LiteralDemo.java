package day02;

/**
 * 用于测试基本类型的字面值规则
 * @author Rookie YU
 * @create 2021-03-01 15:48
 */
public class LiteralDemo {
    public static void main(String[] args) {
        int a = 99999;//int->int,右边数据的字面值就是int类型
//        int b = 9999999999;//错,右边的数字太大了,超出int的范围

        double r =3.14;//对
//        float r =3.14;//错，右面的数据字面值是double，float是4字节存不下double类型的数据

        long x =99999999999L;//字面值是int类型,需转成long类型的数据,加字面值后缀L即可
        float b = 3.0F;//3.0字面值是double类型，加后缀F会变成float类型
        double d = 3D;//3字面值是int类型，加后缀D，会变成double类型

        /**
         * 小到大,直接转(隐式转换)
         */
        byte m = 120;
        int n = m;//小转大,右边的m是小类型,给左边的大类型n直接赋值.

        float f=3.2f;
        double d2=f;//小转大 float->double

        /**大到小，强制转（显示转换）*/
        int h=128;
        byte b3=(byte)x;
        System.out.println(b3);

        float f2=33.5f;
        int i=(int)f2;
        System.out.println(i);

        /**运算规则*/
        /**1.计算结果的数据类型，与最大类型一致*/
        System.out.println(3/2);//1.int/int，得到的结果还是int类型
        System.out.println(3/2d);//1.5 int/double，得到的结果是double
        /**2.byte short char三种比int小的整数，
         * *运算时先转换成int在进行计算*/
         byte j=-1;
         byte k=-128;
         byte l=(byte)(j+k);
        System.out.println(l);
        /**3.整数运算溢出*/
        /**
         * 溢出的现象：
         * 因为做了大的整数数据的运算，超出了int的范围
         * 解决办法：把整数int类型提升成long类型
         **/
        //需求：光运行一年的长度是多少米？3亿m/s
        System.out.println(300000000L*60*60*24*365);

        /**4.浮点数运算不精确*/
        /**这是一个现象，后续会学习解决方案*/
        System.out.println((float) (1-0.8));

        /**5.浮点数的特殊值*/
        System.out.println(3.14/0);//Infinity--无穷大
        System.out.println(0/0.0);//NaN-Not a Number
        System.out.println(0.0/0);//NaN-Not a Number
    }
}
