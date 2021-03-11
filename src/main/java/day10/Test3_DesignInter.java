package day10;

/**
 * 本类用于改造老师设计案例，采用面向接口编程
 */
public class Test3_DesignInter {
    public static void main(String[] args) {
        Teacher2 CGB=new CGBTeacher2();
        CGB.ready();
        CGB.teach();
    }
}
//抽取共性，形成抽象层--体现接口--定义的是规则
//1.通过interface关键字定义接口
interface Teacher2{
    //2.接口中的方法都是抽象方法，可以简写public abstract
    void ready();//2.1备课方法
    void teach();//2.2上课方法
}
/*
    3.如果实现类想要使用接口的功能，就需要与接口建立现实关系
 */

class CGBTeacher2 implements Teacher2{

    @Override
    public void ready() {
        System.out.println("准备课件");
    }

    @Override
    public void teach() {
        System.out.println("上课");
    }
}
//4.创建接口的抽象子类
abstract class SCDTeacher2 implements Teacher2{

}
//5.创建接口的抽象子类2
abstract class ACTTeacher2 implements Teacher2{

    @Override
    public void ready() {
        System.out.println("正在备课...基础加强...框架加强...高新加强");
    }

    @Override
    public abstract void teach();
}
