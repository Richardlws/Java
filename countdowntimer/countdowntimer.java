package countdowntimer;

import java.util.Timer;
import java.util.TimerTask;

public class countdowntimer {
    public static void main(String[] args){
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {


            int count = 5;

            @Override
            public void run() {
                System.out.println(count);
                count--;
                if(count<0){
                    System.out.println("Happy New Year!");
                    timer.cancel();
                }
            }
        };
        timer.scheduleAtFixedRate(task,0,1000);
    }
}
