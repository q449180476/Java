package day01;

import java.util.Objects;

//学生类
public class Test_Object2_Student {
    //成员变量
    private int id;     //编号
    private String name;//姓名
    private int score;  //成绩
    //构造方法


    public Test_Object2_Student() {

    }

    public Test_Object2_Student(int id, String name, int score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScore(int score) {
        this.score = score;
    }
    //toString(),用来将对象转成其对应的字符串形式。

    @Override
    public String toString() {
        return "Test_Object2_Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

    /*
    equals（）方法，用来比较两个对象是否相同的
    自定义版的重写equals（）方法，过程理解即可。
    假设id属性值相同，两个对象就是同一个对象
     */
//    public boolean equals(Object obj){//s1.equals(s2)
//            /*
//                this:谁调用，this就表示谁。  S1
//                obj：s2
//             */
//        Test_Object2_Student s2=(Test_Object2_Student)obj;//向下造型
//        return this.id==s2.id;
//    }


   //通过快捷键的方式生成，步骤掌握，代码理解
    @Override
    public boolean equals(Object o) {
        //this:s1  o:s2
        //比较两个对象的地址值是否相同，提高效率
        //补充：如果if语句控制的语句体只有一行代码，那么{}可以省略不写
        if (this == o)
            return true;

        //判断要比较的两个对象是否是同一个类型的对象，提高程序的健壮性
        //判断字节码一不一样，字节码只有一个
        if (o == null || this.getClass() != o.getClass())
            return false;

        //向下转型，正常的逻辑代码。
        Test_Object2_Student that = (Test_Object2_Student) o;
        return id == that.id &&
                score == that.score &&
                name.equals(that.name);//调用String类中的equals方法
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, score);
    }
}
