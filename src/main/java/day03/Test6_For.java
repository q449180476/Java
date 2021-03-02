package day03;

/**
 * 本类用来测试循环结构for循环
 */
public class Test6_For {
    public static void main(String[] args) {
        //需求：打印0到10
        //for（开始条件；循环条件；更改条件）{循环体；}
        for(int i=0;i<=10;i++){
            System.out.print(i+" ");

        }System.out.println();
        //需求：打印10到0
        //10 9 8 7 6 5 4 3 2 1 0
        //从哪开始：10
        //到哪结束：0
        //怎么变化：-1 --
        //for（开始条件；循环条件；更改条件）{}
        for(int i=10;i>=0;i--){
            System.out.print(i+" ");
        }
        System.out.println();
        //需求：打印8,88,888,8888
        for(int i=8;i<=8888;i=i*10+8){
            System.out.print(i+",");
        }
    }
}
