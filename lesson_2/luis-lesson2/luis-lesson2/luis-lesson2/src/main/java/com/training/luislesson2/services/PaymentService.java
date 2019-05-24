package com.training.luislesson2.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PaymentService {

    private static final Logger LOG = LoggerFactory.getLogger(PaymentService.class);

    @Autowired
    private StorageService storageService;

    public void pay(float amount){
        LOG.info("Register payment with amount: " + amount);
        String convertedText = String.valueOf(amount);
        storageService.save(convertedText);
        LOG.debug("Payment registered succesfully");
    }

    public float showLastPaymentAmount(){
        LOG.debug("showLastPaymentAmount method called.");
        String storedText = storageService.load();
        LOG.trace("Storage loaded text: " + storedText);
        if(storedText.equals("")){
            return 0;
        }
        return Float.valueOf(storedText);
    }
}
