package day04;

/**
 * 需求打印99乘法表
 */
public class Test3_For99Excel {
    public static void main(String[] args) {
        for(int i=1;i<10;i++){
            for (int j=1;j<i;j++){
                System.out.print(j+"*"+i+"="+i*j+" ");//注意这里不换行
            }
            //4.空白行用来换行
            System.out.println();
        }
    }
}
