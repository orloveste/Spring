package myApp.spring.timers;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class MyTimer {
    @Scheduled(fixedRate = 1000) //trigger
    public void reportCurrentTime() {//business trebuie executat candva automat
        System.out.println(this + " stupid timer was triggered at " + new Date());
    }
}