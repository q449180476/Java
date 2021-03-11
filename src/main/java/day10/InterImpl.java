package day10;

/**
 * 本类座位Inter接口的实现类
 * 1.实现类如果想使用接口的功能，建立与接口的关系，需要使用implements关键字
 * 2.方案一：如果实现类实现了接口后，可以选择变成一个抽象子类
 *   方案二：实现类实现了接口后，可以选择实现接口中所有抽象方法
 */

public class InterImpl implements Inter{

    @Override
    public void eat() {
        System.out.println("今天吃火锅");
    }

    @Override
    public void play() {
        System.out.println("玩啥玩，写代码吧~");
    }
}
