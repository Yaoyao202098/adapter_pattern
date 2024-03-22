package com.lw.adapter.obj_adapter.heart_test;

/**
 * @BelongsProject: design_pattern
 * @BelongsPackage: com.lw.adapter.obj_adapter.heart_test
 * @Author: lw
 * @CreateTime: 2024-01-16  20:28
 * @Description: TODO
 * @Version: 1.0
 */

public class EmotionAnalyzerSystem {
    private EmotionInterface emotionInterface;

    public EmotionAnalyzerSystem(EmotionInterface emotionInterface) {
        this.emotionInterface = emotionInterface;
    }

    public void analyzeEmotion() {
        String emotionLabel = emotionInterface.getEmotionLabel();
        if (emotionLabel == null) {
            throw new NullPointerException("分析失败");
        }
        System.out.println("分析的情感结果是:" + emotionLabel);
    }
}
