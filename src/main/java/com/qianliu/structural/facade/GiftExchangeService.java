package com.qianliu.structural.facade;

/**
 * 礼物兑换的服务：符合迪米特法则，前面三个模块的使用顺序和如何使用全部封装在该类中，将该方法暴露即可，其他三个模块都隐藏起来
 */
public class GiftExchangeService {
    private QualifyService qualifyService = new QualifyService();
    private PointPaymentService pointPaymentService = new PointPaymentService();
    private ShippingService shippingService = new ShippingService();

    /**
     * 兑换礼物的流程
     * @param pointGift
     */
    public void giftExchange(PointGift pointGift){
        if(qualifyService.isAvailable(pointGift)){
            //资格校验通过
            if(pointPaymentService.pay(pointGift)){
                //如果支付积分成功
                String shippingOrderNo = shippingService.shipGift(pointGift);
                System.out.println("物流系统下单成功,订单号是:"+shippingOrderNo);
            }
        }
    }

}
