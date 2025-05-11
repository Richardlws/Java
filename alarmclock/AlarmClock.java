package alarmclock;

import javax.sound.sampled.*;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.time.LocalTime;
import java.util.Scanner;

public class AlarmClock implements Runnable {

    private final LocalTime alarmTime;
    private final String filePath;
    private final Scanner scanner;

    AlarmClock(LocalTime alarmTime, String filePath, Scanner scanner) {
        this.alarmTime = alarmTime;
        this.filePath = filePath;
        this.scanner = scanner;
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

    private void playSound(String filePath) {
        File audioFile = new File(filePath);

        try (AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile)) {
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();
            System.out.print("Press *Enter* to stop the alarm: ");
            scanner.nextLine();
            clip.stop();
            scanner.close();
            //Thread.sleep(5000);
        } catch (UnsupportedAudioFileException e) {
            System.out.println("Audio file format is not supported");
        } catch (LineUnavailableException e) {
            System.out.println("Audio is unavailable");
        } catch (IOException e) {
            System.out.println("Error reading audio file");
        }
        //catch(InterruptedException e ){
        //    throw new RuntimeException(e);
        //}

    }
}
