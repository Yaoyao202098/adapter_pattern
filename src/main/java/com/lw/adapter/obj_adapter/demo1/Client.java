package com.lw.adapter.obj_adapter.demo1;

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
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter(new Voltage220V()));
        phone.charging(new VoltageAdapter(() -> 110));

//        Phone phone = new Phone();
//        VoltageAdapter adapter = new VoltageAdapter();
//        // 使用set方法设置Voltage220V的实例
//        adapter.setVoltage220V(new Voltage220V());
        // 将适配器传递给Phone进行充电
//        phone.charging(adapter);
    }
}
