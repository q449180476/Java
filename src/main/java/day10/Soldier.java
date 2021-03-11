package day10;

import java.util.Random;

/**
 * 本类用于封装士兵相关的属性和方法
 * 封装成一个"类"组件1
 */
public class Soldier {
    //2.定义属性--成员变量--可以不用初始化，默认值是0
    int id;//定义编号
    int blood=100;//定义血量
    AK47 a;//默认值null

    //3.定义成员方法
    public void go(){
        //this是一个特殊的引用，引用的就是当前对象的地址，代表的就是本类
        System.out.println(this.id+"士兵在前进");
    }
    public void attack(){//攻击方法
        if(blood==0){
            System.out.println("这是"+id+"号士兵的尸体！");
            return;
        }
        //模拟仅供掉血
        //1.生成一个随机数d用来表示掉血量
        int d=new Random().nextInt(10);
        //2.当前血=初始血-掉血量
        blood=blood-d;
        //3.判断并控制血量
        if (blood<0){//不能出现负数的情况
            blood=0;//如果血量变成了附属，归零
        }
        System.out.println(id+"被攻击了，当前血量:"+blood);
        if(blood==0){
            System.out.println(id+"士兵阵亡了");
        }
    }
}

