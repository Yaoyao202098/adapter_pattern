package com.lw.adapter.obj_adapter.attend_test;


/**
 * @BelongsProject: design_pattern
 * @BelongsPackage: com.lw.adapter.obj_adapter.attend_test
 * @Author: lw
 * @CreateTime: 2024-01-18  13:49
 * @Description: TODO
 * @Version: 1.0
 */

public class Adapter implements AttendInterface{
    private ThirdAttendInterface thirdAttendInterface;
    public Adapter(ThirdAttendInterface thirdAttendInterface){
        this.thirdAttendInterface=thirdAttendInterface;
    }
    @Override
    public String getAttendLabel() {
        if (thirdAttendInterface.getAttendNum()==1){
            return "在职";
        }else if (thirdAttendInterface.getAttendNum()==0){
            return "请假";
        }else return "离职";
    }
}
