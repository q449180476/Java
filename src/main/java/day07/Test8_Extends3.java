package day07;

/**
 * 本类用于测试继承中构造方法的使用
 */
public class Test8_Extends3 {
    public static void main(String[] args) {
        //6.创建子类对象进行测试
        Son3 s=new Son3();
    }
}

//1.创建父类
class Father3{
    //3.创建父类的无惨与含参构造
    public  Father3(){
        System.out.println("我是父类的无惨构造");
    }
    public Father3(String s){
        System.out.println("我是父类的含参构造"+s);
    }
}

//2.创建子类
class Son3 extends Father3{
    /*
        构造方法可以被继承吗?--不可以！！！
        语法要求天然就不符合：构造方法需要与类名同名
     */
    //4.创建子类的无惨构造
    public Son3(){
        /*
            子类的构造方法中，默认存在super()
            所以创建子类对象调用子类的构造方法时，默认先去调用父类的无参构造
         */
        super();
        System.out.println("我是子类的无惨构造");
    }
}

