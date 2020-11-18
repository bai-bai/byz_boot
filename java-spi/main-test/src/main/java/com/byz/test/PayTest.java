package com.byz.test;

import com.byz.service.PayService;

import java.util.ServiceLoader;

public class PayTest {

    public static void main(String[] args) {

        ServiceLoader<PayService> payServices = ServiceLoader.load(PayService.class);
        for (PayService payService:payServices){
            payService.pay();
        }

    }

}
