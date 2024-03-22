package com.lw.LiShiTiHuan_principle.demo2;

/**
 * @BelongsProject: design_pattern
 * @BelongsPackage: com.lw.LiShiTiHuan_principle.demo2
 * @Author: lw
 * @CreateTime: 2024-01-15  10:45
 * @Description: TODO 使用里氏替换原则后（让原来的父类和子类都继承一个更通俗的基类，原来的继承关系去掉后，采用依赖，聚合，组合等关系代替）
 * @Version: 1.0
 */

public class Lis {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("11-3=" + a.func1(11, 3));
        System.out.println("1-8=" + a.func1(1, 8));
        System.out.println("-------------------------");
        B b = new B();
        System.out.println("11-3=" + b.func3(11, 3));
        System.out.println("1-8=" + b.func3(1, 8));
        System.out.println("11+3+9=" + b.func2(11, 3));
    }
}
//创建一个个别国家基础的基类
class Base{
    //把更加基础的方法和成员写到Base类
}
class A extends Base{
    public int func1(int num1, int num2) { //无意识重写了A类的方法
        return num1 - num2;
    }
}

class B extends Base {
    private A a=new A();
    public int func1(int a, int b) {
        return a + b;
    }

    public int func2(int a, int b) {
        return func1(a, b) + 9;
    }
    public int func3(int a,int b){
        return  this.a.func1(a,b);
    }
}