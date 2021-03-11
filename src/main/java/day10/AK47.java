package day10;

import java.util.Random;

/**
 * 本类用于热武器AK47的封装
 */
public class AK47 {
    int bullets = 100;
    public void load(){
        bullets=100;//重置子弹数为100
        System.out.println("弹夹已装满");
    }
    public void fire() {
        if (bullets==0){
            System.out.println("莫得子弹啦！");
            return;//没有子弹就不能开火
        }
        //随机产生发射子弹的数量
        int r = new Random().nextInt(10);
        if (r>bullets){
            r=bullets;//剩几颗发几颗
        }
        bullets=bullets-r;
        for (int i=0;i<r;i++){
            System.out.print("突");
        }
        System.out.println();
        if (bullets==0){
            System.out.print("弹夹空了");
        }
    }
}

