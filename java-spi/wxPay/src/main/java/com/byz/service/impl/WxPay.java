package com.byz.service.impl;

import com.byz.service.PayService;

public class WxPay implements PayService {
    @Override
    public void pay() {
        System.out.println("微信支付");
    }
}
