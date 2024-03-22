package com.lw.adapter.class_adapter.demo1;

/**
 * @BelongsProject: design_pattern
 * @BelongsPackage: com.lw.adapter.demo1
 * @Author: lw
 * @CreateTime: 2024-01-15  16:46
 * @Description: TODO 类适配器,继承被适配者类，实现现有的目标接口
 * @Version: 1.0
 */

public class VoltageAdapter extends Voltage220V  implements IVoltage5V{
    @Override
    public int outPut5V() {
        int src=outPut220v();
        return src / 44;
    }
}
