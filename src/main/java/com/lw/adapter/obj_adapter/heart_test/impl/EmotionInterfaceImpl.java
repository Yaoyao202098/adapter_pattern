package com.lw.adapter.obj_adapter.heart_test.impl;

import com.lw.adapter.obj_adapter.heart_test.EmotionInterface;

/**
 * @BelongsProject: design_pattern
 * @BelongsPackage: com.lw.adapter.obj_adapter.heart_test
 * @Author: lw
 * @CreateTime: 2024-01-16  20:33
 * @Description: TODO
 * @Version: 1.0
 */

public class EmotionInterfaceImpl implements EmotionInterface {
    @Override
    public String getEmotionLabel() {
        return "happy";
    }
}
