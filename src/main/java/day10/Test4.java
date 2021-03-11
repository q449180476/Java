package day10;

public class Test4 {
    public static void main(String[] args) {
        Inter3lmpl i=new Inter3lmpl();
        i.delete();
        i.find();
        i.save();
        i.update();
    }

}
//1.创建接口1
interface Inter_1{
    void save();//保存功能
    void delete();//删除功能
}
//2.创建接口2
interface Inter_2{
    void update();//更新功能
    void find();//查询功能
}
//3.创建接口3用来测试接口与接口的继承关系
/*
   1.接口之间可以建立继承关系，而且还可以多继承，接口与接口之间用逗号隔开。
   2.接口和实现类之间可以建立实现关系,通过implements关键字来完成
   注意:由于java是单继承多实现,所以,要先继承,再写实现
 */
interface Inter_3 extends Inter_1,Inter_2{

}
//4.创建Inter3接口的实现类
class Inter3lmpl implements Inter_3{

    @Override
    public void save() {
        System.out.println("稍等...正在保存中...");
    }

    @Override
    public void delete() {
        System.out.println("稍等...正在删除中...");
    }

    @Override
    public void update() {
        System.out.println("客观，马上就更新好啦~~~");
    }

    @Override
    public void find() {
        System.out.println("小二正在马不停蹄的查询");
    }
}
