package com.iperez.kafka.services;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.iperez.kafka.model.Incident;

@Service
public class KafkaConsumer {
	
	@KafkaListener(topics="${jsa.kafka.topic}")
    public void processMessage(Incident incident) {
		System.out.println("received content = " + incident.getNombre());
    }
}
