package day04;

/**
 * 需求：利用for循环嵌套，打印左直角三角形
 */
public class Test2_ForTriangle {
    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            for (int j=0;j<5;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
