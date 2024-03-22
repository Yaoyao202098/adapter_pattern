package com.lw.adapter.obj_adapter.demo1;

/**
 * @BelongsProject: design_pattern
 * @BelongsPackage: com.lw.adapter.demo1
 * @Author: lw
 * @CreateTime: 2024-01-15  16:39
 * @Description: TODO 被适配类
 * @Version: 1.0
 */

public class Voltage220V{
    public int outPut220v()
    {
        int src=220;
        System.out.println("电压="+src+"伏");
        return src;
    }
}
