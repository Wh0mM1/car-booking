package com.wh0mm1.carbookdriver.service;


import com.wh0mm1.carbookdriver.constant.AppConstant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class CabLocationServiceImpl{

    @Autowired
    private KafkaTemplate<String,Object> kafkaTemplate;

    public boolean updateLocation(String location)
    {
        kafkaTemplate.send(AppConstant.CAB_LOCATION,location);
        return true;
    }
}
