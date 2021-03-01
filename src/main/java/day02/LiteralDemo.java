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

        double f=3.2;
        float s=3.2f;
        f=s;

        x=(long)b;
        x=a;

    }
}
