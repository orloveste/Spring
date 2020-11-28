package myApp.spring.timers;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class MyTimer {
    @Scheduled(fixedRate = 1000)
    public void reportCurrentTime() {
        System.out.println(this + " stupid timer was triggered at " + new Date());
    }
}