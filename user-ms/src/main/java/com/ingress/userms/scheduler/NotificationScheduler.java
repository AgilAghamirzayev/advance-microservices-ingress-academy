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

    @Scheduled(cron = "5 4 2 3 1") //At 04:05 on day-of-month 2 and on Monday in March
    @SchedulerLock(name = "sendNotificationWithCron", lockAtLeastFor = "PT1M", lockAtMostFor = "PT5M")
    public void sendNotificationWithCron() {
        notificationService.sendNotificationWithCron();
    }

}
