package day02;
/**
 * 本类用于查看基本类型的最大值与最小值
 * Ctrl+Alt+向下键 快速向下复制一行
 * @author Theshy
 *
 */
public class Test2_TypeScope {
    //必须要写入口函数，否则代码无法执行，因为没有入口
    public static void main(String[] args) {
        //进行整形类型的测试 byte1 short2 int4 long8
        //1.定义变量，用变量分别保存最大值与最小值
        //定义变量 数据类型 变量名 变量值 Ctrl+Alt+向下键 快速向下复制一行 换位置：Alt+方向键
        /**Java提供了对应的基本类型的工具箱*/
        byte byteMax = Byte.MAX_VALUE;
        byte byteMin = Byte.MIN_VALUE;
        System.out.println("byte类型的最大值是：" + byteMax);
        System.out.println("byte类型的最小值是：" + byteMin);

        short shortMax = Short.MAX_VALUE;
        short shortMin = Short.MIN_VALUE;
        System.out.println("short类型的最大值" + shortMax);
        System.out.println("short类型的最小值" + shortMin);

        int intMax = Integer.MAX_VALUE;
        int intmin = Integer.MIN_VALUE;
        System.out.println("int类型的最大值" + intMax);
        System.out.println("lint类型的最小值" + intmin);

        long longMax = Long.MAX_VALUE;
        long longmin = Long.MIN_VALUE;
        System.out.println("long类型的最大值" + longMax);
        System.out.println("long类型的最小值" + longmin);

        //浮点型测试 float4 double8
        float floatMax = Float.MAX_VALUE;
        float floatMin = Float.MIN_VALUE;
        System.out.println("float类型的最大值" + floatMax);
        System.out.println("float类型的最小值" + floatMin);

        double doubleMax = Double.MAX_VALUE;
        double doubleMin = Double.MIN_VALUE;
        System.out.println("double类型的最大值" + doubleMax);
        System.out.println("double类型的最小值" + doubleMin);

        //布尔型boolean
        boolean b1 = true;
        boolean b2 = false;

        //字符型char
        char c1 = 'a';//可以保存
        char c2 = '中';
        char c3 = 97;
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
    }
}
