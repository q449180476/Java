package day03;

import java.util.Scanner;

/**
 * 需求：接收用户输入的原价，满1000打9折，满2000打8折，满5000打5折
 */
public class Test4_Discout {
    public static void main(String[] args) {
        //1.提示用户输入原价
        System.out.println("请输入商品原价：");
        //2.接收用户输入的原价
        double price=new Scanner(System.in).nextDouble();
        //3.计算打折后的价格
        if(price>=5000){//满5000
            price*=0.5;//打5折
        }
       else if(2000<=price){//满2000
            price*=0.8;//打8折
        }
       else if (1000<=price){//满1000
            price*=0.9;//打9折
        }
        //输出用户实际支付的价格
        System.out.println(price);

    }
}
