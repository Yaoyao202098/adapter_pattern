package com.lw.adapter.obj_adapter.heart_test;

import com.lw.adapter.obj_adapter.heart_test.impl.EmotionInterfaceImpl;

/**
 * @BelongsProject: design_pattern
 * @BelongsPackage: com.lw.adapter.obj_adapter.heart_test
 * @Author: lw
 * @CreateTime: 2024-01-16  20:32
 * @Description: TODO
 * @Version: 1.0
 */

public class Client {
    public static void main(String[] args) {
//        EmotionAnalyzerSystem analyzerSystem=new EmotionAnalyzerSystem(new EmotionInterfaceImpl());
//        analyzerSystem.analyzeEmotion();
        EmotionAnalyzerSystem analyzerSystem=new EmotionAnalyzerSystem(new EmotionAdapter(new ThirdEmotionInterface() {
            @Override
            public int getEmotionNum() {
                return 51;
            }
        }));
        analyzerSystem.analyzeEmotion();
    }
}
