package com.lw.adapter.class_adapter.demo3.Impl;

import com.lw.adapter.class_adapter.demo3.SDCard;

/**
 * @BelongsProject: design_pattern
 * @BelongsPackage: com.lw.adapter.class_adapter.demo3.Impl
 * @Author: lw
 * @CreateTime: 2024-01-16  14:13
 * @Description: TODO
 * @Version: 1.0
 */

public class SDCardImpl implements SDCard {
    @Override
    public String readSD() {
        return "sd card read msg:hello SD";
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("sd card write msg" + msg);
    }
}
