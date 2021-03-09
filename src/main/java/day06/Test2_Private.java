package day06;

/**
 * 本类用于测试封装
 */
public class Test2_Private {
}
//1.通过class关键字创建学生类--描述学生这一类型--属性+方法
class Student{
    //姓名
    String name;
    //学号
    int sno;
    //科目
    String subject;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
