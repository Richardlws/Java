package alarmclock;

import java.awt.*;
import java.time.LocalTime;

public class AlarmClock implements Runnable {

    private final LocalTime alarmTime;

    AlarmClock(LocalTime alarmTime) {
        this.alarmTime = alarmTime;
    }

    @Override
    public void run() {

        //System.out.println(now);
        while (LocalTime.now().isBefore(alarmTime)) {
            try {
                Thread.sleep(1000);

                LocalTime now = LocalTime.now();

                //int hours = now.getHour();
                //int minutes = now.getMinute();
                //int seconds = now.getSecond();

                //System.out.println(hours + ":" + minutes + ":" + seconds);
                System.out.printf("\r%02d:%02d:%02d",
                                    now.getHour(),
                                    now.getMinute(),
                                    now.getSecond());

                //System.out.println(LocalTime.now());
            } catch (InterruptedException e) {
                System.out.println("Thread was interrupted");
            }
        }

        System.out.println("\n*Alarm Noises*");
        Toolkit.getDefaultToolkit().beep();

    }
}
