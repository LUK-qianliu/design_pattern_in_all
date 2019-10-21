package com.qianliu.structural.facade;


public class QualifyService {
    /**
     * 是否可以购买积分礼物
     * @param pointGift
     * @return
     */
    public boolean isAvailable(PointGift pointGift){
        System.out.println("校验"+pointGift.getName()+" 积分资格通过,库存通过");
        return true;
    }
}
