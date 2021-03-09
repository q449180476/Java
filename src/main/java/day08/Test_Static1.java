package day08;

/**
 * 本类用于测 试静态的入门案例
 */
public class Test_Static1 {
    public static void main(String[] args) {
        Student s=new Student();
        //6.更改并查看name属性值
        s.name="黄桃罐头";
        System.out.println(s.name);
        //7.调用学生类的方法
        s.study();
        s.speak();
        //8.创建多个对象进行测试
        Student s2=new Student();
        System.out.println(s2.name);
        //9.通过类名直接调用静态资源进行测试
        System.out.println(Student.name);
        Student.study();
    }
}

//1.创建学生类
class Student{
    /*
        1.可以通过static关键字将普通资源修饰成静态资源
        2.static可以用来修饰成员变量和方法，一般写在权限修饰符之后
        3.静态资源可以通过类名直接调用
        4.静态资源是优先于对象进行加载的，随着类的加载而加载
        比对象先加载进入内存，没对象时也可以被类名直接调用
        5.静态资源全局共享
     */
    //2.定义属性--成员变量--无需手动初始化
    int sno;
    static String name;

    //3.定义方法--修饰符 返回值类型 方法名(参数列表){方法体}
    public static void study(){
        System.out.println("别闹学java呢");
    }
    public void speak(){
        System.out.println("大声说出来~~");
    }

}
