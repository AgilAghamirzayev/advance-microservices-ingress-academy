package com.ingress.userms.scheduler;

import com.ingress.userms.service.NotificationService;
import lombok.RequiredArgsConstructor;
import net.javacrumbs.shedlock.spring.annotation.SchedulerLock;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class NotificationScheduler {
    private final NotificationService notificationService;

    @Scheduled(fixedDelayString = "PT3S")
    @SchedulerLock(name = "sendNotification", lockAtLeastFor = "PT1M", lockAtMostFor = "PT5M")
    public void sendNotification() {
        notificationService.sendNotification();
    }

    @Scheduled(cron = "1 * * * * *")
    @SchedulerLock(name = "sendNotificationWithCron", lockAtLeastFor = "PT1M", lockAtMostFor = "PT5M")
    public void sendNotificationWithCron() {
        notificationService.sendNotificationWithCron();
    }

}
