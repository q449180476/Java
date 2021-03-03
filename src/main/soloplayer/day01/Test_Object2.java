package day01;

/**
 * 需求：定义一个表针的JavaBean类，并在测试类中进行测试
 * 学生类：Student
 * 属性：id（编号），name（名字），score（成绩）
 * 注意：
 *      实际开发中，我们把两个对象的各个属性值都相同的情况下，才会认为这两个对象是同一个对象
 */
public class Test_Object2 {
    public static void main(String[] args) {
        //测试toString()方法
        //创建学生类的对象
        Test_Object2_Student s1=new Test_Object2_Student(1,"欧阳修",66);

        //输出语句直接打印对象，默认调用了该对象的toString（）方法
        System.out.println(s1);
        System.out.println(s1.toString());

        //测试equals（）方法,s1.equals(s2);
        Test_Object2_Student s2=new Test_Object2_Student(10,"欧阳修",66);
        boolean b1=s1.equals(s2);
        System.out.println(b1);
    }
}
