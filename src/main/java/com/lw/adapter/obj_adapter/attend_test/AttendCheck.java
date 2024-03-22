package com.lw.adapter.obj_adapter.attend_test;

/**
 * @BelongsProject: design_pattern
 * @BelongsPackage: com.lw.adapter.obj_adapter.attend_test
 * @Author: lw
 * @CreateTime: 2024-01-18  13:38
 * @Description: TODO
 * @Version: 1.0
 */

public class AttendCheck {
    public void check(AttendInterface attendInterface){
        System.out.println(attendInterface.getAttendLabel());
    }
}
