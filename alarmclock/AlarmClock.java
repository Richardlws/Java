package alarmclock;

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

                int hours = LocalTime.now().getHour();
                int minutes = LocalTime.now().getMinute();
                int seconds = LocalTime.now().getSecond();

                //System.out.println(hours + ":" + minutes + ":" + seconds);
                System.out.printf("%02d:%02d:%02d",hours,minutes,seconds);
                System.out.println();

                //System.out.println(LocalTime.now());
            } catch (InterruptedException e) {
                System.out.println("Thread was interrupted");
            }
        }

    }
}
