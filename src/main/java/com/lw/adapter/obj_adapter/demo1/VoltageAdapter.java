package com.lw.adapter.obj_adapter.demo1;

/**
 * @BelongsProject: design_pattern
 * @BelongsPackage: com.lw.adapter.demo1
 * @Author: lw
 * @CreateTime: 2024-01-15  16:46
 * @Description: TODO 对象适配器
 * @Version: 1.0
 */

public class VoltageAdapter implements IVoltage5V {
    private Voltage220V voltage220V; //聚合关系
    private Voltage110V voltage110V;

//    通过构造器传入一个Voltage220V的实例
    public VoltageAdapter(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    public VoltageAdapter(Voltage110V voltage110V){
        this.voltage110V=voltage110V;
    }
    // 使用set方法设置Voltage220V的实例
//    public void setVoltage220V(Voltage220V voltage220V) {
//        this.voltage220V = voltage220V;
//    }
    @Override
    public int outPut5V() {
        int target_v;
        if (voltage220V!=null){
            target_v=voltage220V.outPut220v()/44;
        }else if(voltage110V!=null){
            target_v=voltage110V.outPut110V()/22;
        }else throw new NullPointerException("错误");
        return target_v;
    }
}
