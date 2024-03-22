package com.lw.adapter.inteface_adapter.demo1;

/**
 * @BelongsProject: design_pattern
 * @BelongsPackage: com.lw.adapter.inteface_adapter.demo1
 * @Author: lw
 * @CreateTime: 2024-01-15  20:31
 * @Description: TODO
 * @Version: 1.0
 */

public class Client{
    public static void main(String[] args) {
        AbsClass absClass = new AbsClass() {
            //只需要去覆盖我们需要的方法
            @Override
            public void m1() {
                System.out.println("使用了m1方法");
            }
        };
        absClass.m1();
    }
}
