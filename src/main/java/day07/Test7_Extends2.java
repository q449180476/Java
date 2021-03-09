package day07;

/**
 * 本类用于测试继承中成员方法的使用
 */
public class Test7_Extends2 {
    public static void main(String[] args) {
        Son2 s=new Son2();
        s.eat();
    }
}

//1.创建父类
class Father2{
    //3.创建父类的成员方法
    public void eat(){
        System.out.println("father loves to eat meat");
    }
}
//2.创建子类Son2
class Son2 extends Father2{
    /*
        OCP原则：面向功能修改关闭，面向功能拓展开放
        --只允许拓展，不允许修改原来的代码
    */
    /*
        重写的规则：和父类的方法签名保持一致
        [返回值类型&方法名&参数列表]
        子类的权限修饰符必须大于等于父类的权限修饰符
        void eat（）一模一样，改的是方法体
     */

    public void eat(){
        System.out.println("son loves to eat shit");
    }

    //7.子类还可以拥有自己特有的功能
    public void study(){
        System.out.println("来学习JAVA");
    }
}