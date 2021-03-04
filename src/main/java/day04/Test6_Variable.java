package day04;

/**
 * 本类用于测试变量的使用
 */
public class Test6_Variable {
    /*
        定义成员变量
        1）位置：类里方法外
        2）无需手动初始化，会自动赋予对应类型的默认值
        3）作用域：在整个类中都生效，类消失，变量才会消失
     */
    static int count;
    public static void main(String[] args) {
        /*
            定义局部变量
            1）位置：在方法里的局部代码快里
            2）必须手动初始化：
            3）作用域：在方法/局部代码快里，对应的代码执行完毕，局部变量也释放了
         */
        int sum=100;//定义在方法中的局部变量sum
        System.out.println(sum);
        System.out.println(count);
        for(int i=1;i<5;i++){
            for (int x=4;x>i;x--){
                System.out.print(" ");
            }
            for (int j=0;j<i*2-1;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }

        for(int i=4;i>0;i--){
            for (int x=4;x>i;x--){
                System.out.print(" ");
            }
            for (int j=0;j<i*2-1;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
