package com.lw.adapter.class_adapter.demo3;

import com.lw.adapter.class_adapter.demo3.Impl.SDCardImpl;

/**
 * @BelongsProject: design_pattern
 * @BelongsPackage: com.lw.adapter.class_adapter.demo3
 * @Author: lw
 * @CreateTime: 2024-01-16  14:07
 * @Description: TODO
 * @Version: 1.0
 */

public class Client {
    public static void main(String[] args) {
        Computer computer=new Computer();
        System.out.println(computer.readSD(new SDCardImpl()));
        //使用适配器之后
        SDAdapterTF sdAdapterTF=new SDAdapterTF();
        System.out.println(computer.readSD(sdAdapterTF));
    }
}
