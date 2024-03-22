package com.lw.adapter.obj_adapter.demo2.Impl;

import com.lw.adapter.obj_adapter.demo2.TFCard;

/**
 * @BelongsProject: design_pattern
 * @BelongsPackage: com.lw.adapter.class_adapter.demo3.Impl
 * @Author: lw
 * @CreateTime: 2024-01-16  14:09
 * @Description: TODO 适配者类
 * @Version: 1.0
 */

public class TFCardImpl implements TFCard {

    @Override
    public String readTF() {
        return "tf card read msg:hello TF";
    }
    @Override
    public void writeTF(String msg) {
        System.out.println("tf card write msg:" + msg);
    }
}
