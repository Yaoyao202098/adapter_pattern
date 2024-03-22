package com.lw.adapter.class_adapter.demo1;

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
        phone.charging(new VoltageAdapter());
    }
}
