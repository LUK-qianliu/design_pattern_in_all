package com.qianliu.behavioral.strategy;

/**
 * 促销活动
 */
public class PromotionActivity {
    private PromotionStrategy promotionStrategy;

    // 传入促销策略
    public PromotionActivity(PromotionStrategy promotionStrategy) {
        this.promotionStrategy = promotionStrategy;
    }

    public void executePromotionStrategy(){
        promotionStrategy.doPromotion();
    }

}
