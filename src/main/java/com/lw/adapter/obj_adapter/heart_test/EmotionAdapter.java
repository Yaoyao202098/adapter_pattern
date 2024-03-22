package com.lw.adapter.obj_adapter.heart_test;

/**
 * @BelongsProject: design_pattern
 * @BelongsPackage: com.lw.adapter.obj_adapter.heart_test
 * @Author: lw
 * @CreateTime: 2024-01-16  20:37
 * @Description: TODO
 * @Version: 1.0
 */

public class EmotionAdapter implements EmotionInterface{
    private ThirdEmotionInterface thirdEmotionInterface;
    public EmotionAdapter(ThirdEmotionInterface thirdEmotionInterface){
        this.thirdEmotionInterface=thirdEmotionInterface;
    }
    @Override
    public String getEmotionLabel() {
        int index=thirdEmotionInterface.getEmotionNum();
        if (index> 75) {
            return "Happy";
        } else if (index> 50) {
            return "Neutral";
        } else {
            return "Sad";
        }
    }
}
