package com.lw.adapter.class_adapter.demo1;

/**
 * @BelongsProject: design_pattern
 * @BelongsPackage: com.lw.adapter.class_adapter
 * @Author: lw
 * @CreateTime: 2024-01-15  16:53
 * @Description: TODO
 * @Version: 1.0
 */

public class Phone {
    public void charging(IVoltage5V iVoltage5V){
        if (iVoltage5V.outPut5V()==5){
            System.out.println("电压为5伏,可以充电");
        }else {
            System.out.println("电压不合适，无法充电");
        }
    }
}
