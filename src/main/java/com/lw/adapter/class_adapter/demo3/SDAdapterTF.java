package com.lw.adapter.class_adapter.demo3;

import com.lw.adapter.class_adapter.demo3.Impl.TFCardImpl;

/**
 * @BelongsProject: design_pattern
 * @BelongsPackage: com.lw.adapter.class_adapter.demo3
 * @Author: lw
 * @CreateTime: 2024-01-16  14:26
 * @Description: TODO 继承被适配者类，实现目标接口
 * @Version: 1.0
 */

public class SDAdapterTF extends TFCardImpl implements SDCard {
    @Override
    public String readSD() {
        return readTF();
    }

    @Override
    public void writeSD(String msg) {
        writeTF(msg);
    }
}
