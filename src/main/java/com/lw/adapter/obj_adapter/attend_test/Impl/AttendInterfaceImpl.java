package com.lw.adapter.obj_adapter.attend_test.Impl;

import com.lw.adapter.obj_adapter.attend_test.AttendInterface;

/**
 * @BelongsProject: design_pattern
 * @BelongsPackage: com.lw.adapter.obj_adapter.attend_test.Impl
 * @Author: lw
 * @CreateTime: 2024-01-18  13:45
 * @Description: TODO
 * @Version: 1.0
 */

public class AttendInterfaceImpl implements AttendInterface {
    @Override
    public String getAttendLabel() {
        return "在职";
    }
}
