package com.lw.adapter.class_adapter.demo2;

/**
 * @BelongsProject: design_pattern
 * @BelongsPackage: com.lw.adapter.class_adapter
 * @Author: lw
 * @CreateTime: 2024-01-15  16:57
 * @Description: TODO
 * @Version: 1.0
 */

public class Client {
    public static void main(String[] args) {
        // 使用类适配器将VoltageAdapte适配到IVoltage5V接口
        IVoltage5V i=new VoltageAdapter();
        Phone phone = new Phone();
        phone.charging(i);
    }
}
