package com.lw.adapter.class_adapter.demo1;

/**
 * @BelongsProject: design_pattern
 * @BelongsPackage: com.lw.adapter.class_adapter.demo1
 * @Author: lw
 * @CreateTime: 2024-01-17  17:59
 * @Description: TODO
 * @Version: 1.0
 */

public class Voltage5VImpl implements IVoltage5V{
    @Override
    public int outPut5V() {
        return 5;
    }
}
