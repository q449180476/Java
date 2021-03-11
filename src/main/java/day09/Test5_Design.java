package day09;

/**
 * 本类用于设计老师类，面向抽象编程
 */
public class Test5_Design {
    public static void main(String[] args) {
        Teacher ct=new CGBTeacher();
        Teacher t=new SCDTeacher();
        ct.ready();
        ct.teach();
        t.ready();
        t.teach();
    }

}
//生活中的实物--类
//特征--属性&行为--方法

abstract class Teacher{
    int id;
    String name;
    public abstract void ready();
    public abstract void teach();

}
/*
    培优班CGB老师
    属性:姓名 工号
    方法：备课 讲课
    CGB老师--主打电商项目
*/
class CGBTeacher extends Teacher{
    @Override
    public void ready() {
        System.out.println("备课电商项目");
    }

    @Override
    public void teach() {
        System.out.println("电商项目");
    }
}
/*
    SCD大数据老师--主打Scala语言
 */
class SCDTeacher extends Teacher{
    @Override
    public void ready() {
        System.out.println("备课Scala语言");
    }

    @Override
    public void teach() {
        System.out.println("SCALA语言");
    }
}
