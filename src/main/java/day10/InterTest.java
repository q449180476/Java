package day10;

/**
 * 本类用于测试接口的实现类
 * 接口可以创建对象吗？---不可以！
 */
public class InterTest {
    public static void main(String[] args) {
        Inter i=new InterImpl();
        i.eat();
        i.play();
        InterImpl i2=new InterImpl();
        i.play();
        i.eat();
    }
}
