package alarmclock;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.time.LocalTime;

public class AlarmClock implements Runnable {

    private final LocalTime alarmTime;
    private final String filePath;

    AlarmClock(LocalTime alarmTime,String filePath) {
        this.alarmTime = alarmTime;
        this.filePath= filePath;
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
        playSound(filePath);

    }
    private void playSound(String filePath){
        File audioFile = new File(filePath);
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);
        try{

        }
        catch(UnsupportedAudioFileException e){
            System.out.println("Audio file format is not supported");
        }
        catch(LineUnavailableException e){
            System.out.println("Audio is unavailable");
        }
        catch (IOException e){
            System.out.println("Error reading audio file");
        }

    }
}
