package com.lw.adapter.obj_adapter.demo2;

/**
 * @BelongsProject: design_pattern
 * @BelongsPackage: com.lw.adapter.class_adapter.demo3
 * @Author: lw
 * @CreateTime: 2024-01-16  14:08
 * @Description: TODO
 * @Version: 1.0
 */

public class Computer {
    public String readSD(SDCard sdCard){
        if (sdCard==null){
            throw new NullPointerException("sd Card is null");
        }else return sdCard.readSD();
    }
}
