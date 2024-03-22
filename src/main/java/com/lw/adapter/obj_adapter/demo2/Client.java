package com.lw.adapter.obj_adapter.demo2;

import com.lw.adapter.obj_adapter.demo2.Impl.SDCardImpl;
import com.lw.adapter.obj_adapter.demo2.Impl.TFCardImpl;

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
        TFCardImpl tfCard=new TFCardImpl();
        SDAdapterTF sdAdapterTF=new SDAdapterTF();
        sdAdapterTF.setTfCard(tfCard);
        System.out.println(computer.readSD(sdAdapterTF));
    }
}
