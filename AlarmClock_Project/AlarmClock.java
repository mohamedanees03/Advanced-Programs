package AlarmClock_Project;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class AlarmClock implements Runnable {

    private final LocalTime alarmTime;
    private final Scanner scanner;
    private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
    private final String filePath;

    public AlarmClock(LocalTime alarmTime, Scanner scanner) {
        this.alarmTime = alarmTime;
        this.scanner = scanner;
        this.filePath = "N:\\Advanced Java Programs\\AlarmClock_Project\\Powerhouse-Vibe-MassTamilan.dev.wav";
    }

    @Override
    public void run() {
        System.out.println("Waiting for alarm time...");

        while (LocalTime.now().isBefore(alarmTime)) {
            try {
                // Get the current time and print it on the same line
                LocalTime now = LocalTime.now();
                System.out.print("\rCurrent time: " + now.format(formatter));
                Thread.sleep(1000); // wait for 1 second
            } catch (InterruptedException e) {
                System.out.println("\n Thread interrupted.");
                return;
            }
        }

        // Alarm triggered
        System.out.println("\nALARM! It's now " + alarmTime.format(formatter));
        playSound(filePath);
    }

    private void playSound(String filePath) {
        File audioFile = new File(filePath);

        try (AudioInputStream audio = AudioSystem.getAudioInputStream(audioFile)) {
            Clip clip = AudioSystem.getClip();
            clip.open(audio);
            clip.start();
            System.out.println(" Playing alarm sound...");
            System.out.print(" Press ENTER to stop the alarm: ");
            scanner.nextLine(); // wait for user input to stop
            clip.stop();
            clip.close();
            scanner.close();
            System.out.println(" Alarm stopped.");
        } catch (UnsupportedAudioFileException e) {
            System.out.println(" Unsupported audio file format.");
        } catch (LineUnavailableException e) {
            System.out.println(" Audio line unavailable.");
        } catch (IOException e) {
            System.out.println("Error reading audio file.");
        }
    }
}
