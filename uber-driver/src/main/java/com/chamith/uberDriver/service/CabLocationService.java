package com.chamith.uberDriver.service;

import com.chamith.uberDriver.constant.CommonConstant;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CabLocationService {
    private final KafkaTemplate<String,Object> kafkaTemplate;
    public boolean updateLocation(String location) {
        kafkaTemplate.send(CommonConstant.CAB_LOCATION, location);
        return true;
    }
}
