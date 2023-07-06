package com.ingress.userms.service;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.ZoneOffset;

@Log4j2
@Service
public class NotificationService {

    public void sendNotification() {
        log.info("Sending notification at {}", LocalDateTime.now().toEpochSecond(ZoneOffset.UTC));
    }


    public void sendNotificationWithCron() {
        log.info("Sending notification with job at {}", LocalDateTime.now().toEpochSecond(ZoneOffset.UTC));

    }
}
