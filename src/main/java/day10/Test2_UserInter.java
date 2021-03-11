package day10;

/**
 * 本类用于进一步测试接口的使用
 */
public class Test2_UserInter {
    public static void main(String[] args) {
        /*
            问题：子类创建对象时，默认会调用父类的构造方法
            目前接口实现类的父级是一个接口，而接口没有构造方法
            那实现类构造方法中的super()调用的是谁呢？
            jielun：如果一个类没有明确指定父类，那么默认继承顶级父类Object
            所以super（）会自动调用Object类中的无参构造。
         */
        //查看类的继承结构：Ctrl+T
        Inter2 i=new Inter2lmpl();
        //结论2：接口中的变量实际上都是静态常量，可以通过类名直接调用
        System.out.println(Inter2.age);
        //结论3：接口中的变量实际上都是静态常量，值不可以被修改
        //Inter2.age=200
    }
}
//1.创建接口
interface Inter2{
    /*
        接口里可以有成员变量吗？---不可以没有
        是一个静态常量，实际上的写法是static final int age=10;
        只不过在接口中可以省略不写
     */
    static final int age=10;
}

//3.创建接口的实现类
class Inter2lmpl extends Object implements Inter2{
    int age=10;
    //4.创建实现类的构造函数
    public Inter2lmpl(){
        super();
        System.out.println("我是Inter2lmpl的无惨构造");
    }
}
