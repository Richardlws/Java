package musicplayer;
import javax.sound.sampled.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class Main {
    public static void main(String[] args){
        String filePath = "C:\\java\\musicplayer\\3.wav";
        File  file = new File(filePath);

        try(AudioInputStream audioStream = AudioSystem.getAudioInputStream(file)){

            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            System.out.println("No problem detected");
        }
        catch(FileNotFoundException e){
            System.out.println("Could not locate file");
        }
        catch(LineUnavailableException e){
            System.out.println("Unable to access audio resource");
        }
        catch(UnsupportedAudioFileException e){
            System.out.println("Audio file is not supported");
        }
        catch(IOException e){
            System.out.println("Something went wrong");
        }
    }
}
