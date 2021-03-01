package day02;
/**
 * 需求：求出指定半径圆的面积
 * 公式：圆的面积：π*r*r
 * @author Theshy
 *
 */
import java.util.Scanner;
public class Test3_CircleArea {
    public static void main(String[] args) {
        //定义变量用来保存半径值
        System.out.println("请输入圆的半径：");
        Scanner scan=new Scanner(System.in);
        double r=scan.nextDouble();
        System.out.println("面积为："+r*r*3.14);

    }
}