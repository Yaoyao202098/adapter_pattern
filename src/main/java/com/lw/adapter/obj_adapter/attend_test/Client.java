package com.lw.adapter.obj_adapter.attend_test;

import com.lw.adapter.obj_adapter.attend_test.Impl.AttendInterfaceImpl;

/**
 * @BelongsProject: design_pattern
 * @BelongsPackage: com.lw.adapter.obj_adapter.attend_test
 * @Author: lw
 * @CreateTime: 2024-01-18  13:37
 * @Description: TODO
 * @Version: 1.0
 */

public class Client {
    public static void main(String[] args) {
        AttendCheck attendCheck=new AttendCheck();
//        attendCheck.check(new AttendInterfaceImpl());
        Adapter adapter=new Adapter(() -> 1);
        attendCheck.check(adapter);
    }
}
