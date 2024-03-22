package com.lw.adapter.obj_adapter.demo2;

import com.lw.adapter.obj_adapter.demo2.Impl.TFCardImpl;

/**
 * @BelongsProject: design_pattern
 * @BelongsPackage: com.lw.adapter.class_adapter.demo3
 * @Author: lw
 * @CreateTime: 2024-01-16  14:26
 * @Description: TODO 继承被适配者类，实现目标接口
 * @Version: 1.0
 */

public class SDAdapterTF  implements SDCard {
    private TFCardImpl tfCard;
//    public SDAdapterTF(TFCardImpl tfCard){
//        this.tfCard=tfCard;
//    }

    //也可以用set注入
    public void setTfCard(TFCardImpl tfCard) {
        this.tfCard = tfCard;
    }

    @Override
    public String readSD() {
        return tfCard.readTF();
    }

    @Override
    public void writeSD(String msg) {
        tfCard.writeTF(msg);
    }
}
