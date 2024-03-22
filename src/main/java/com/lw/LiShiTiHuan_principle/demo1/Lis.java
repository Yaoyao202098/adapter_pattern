package com.lw.LiShiTiHuan_principle.demo1;

/**
 * @BelongsProject: design_pattern
 * @BelongsPackage: com.lw.LiShiTiHuan_principle.demo1
 * @Author: lw
 * @CreateTime: 2024-01-15  10:29
 * @Description: TODO 使用里氏替换原则前
 * @Version: 1.0
 */

public class Lis {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("11-3=" + a.func1(11, 3));
        System.out.println("1-8=" + a.func1(1, 8));
        System.out.println("-------------------------");
        B b = new B();
        System.out.println("11-3=" + b.func1(11, 3));
        System.out.println("1-8=" + b.func1(1, 8));
        System.out.println("11+3+9=" + b.func2(11, 3));
    }
}

class A {
    public int func1(int num1, int num2) { //无意识重写了A类的方法
        return num1 - num2;
    }
}

class B extends A {
    public int func1(int a, int b) {
        return a + b;
    }

    public int func2(int a, int b) {
        return func1(a, b) + 9;
    }
}