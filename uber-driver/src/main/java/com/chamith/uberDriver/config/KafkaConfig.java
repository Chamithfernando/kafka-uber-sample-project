package com.chamith.uberDriver.config;

import com.chamith.uberDriver.constant.CommonConstant;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaConfig {
    @Bean
    public NewTopic topic() {
        return TopicBuilder
                .name(CommonConstant.CAB_LOCATION)
                .build();
    }
}
