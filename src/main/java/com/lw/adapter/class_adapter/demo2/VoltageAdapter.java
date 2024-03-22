package com.lw.adapter.class_adapter.demo2;

/**
 * @BelongsProject: design_pattern
 * @BelongsPackage: com.lw.adapter.demo1
 * @Author: lw
 * @CreateTime: 2024-01-15  16:46
 * @Description: TODO
 * @Version: 1.0
 */

public class VoltageAdapter extends Voltage220V implements IVoltage5V {
    @Override
    public int outPut() {
        return 5;
    }
}
