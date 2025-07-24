package AlarmClock_Project;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class AlarmClockMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime alarmTime = null;

        // Get valid time input from user
        while (alarmTime == null) {
            try {
                System.out.print("Enter alarm time (HH:mm:ss): ");
                String inputTime = scanner.nextLine();
                alarmTime = LocalTime.parse(inputTime, formatter);
                System.out.println("✅ Alarm set for: " + alarmTime);
            } catch (DateTimeParseException e) {
                System.out.println(" Invalid time format. Please enter in HH:mm:ss (24-hour) format.");
            }
        }

        // Start the alarm thread
        AlarmClock alarmClock = new AlarmClock(alarmTime, scanner);
        Thread alarmThread = new Thread(alarmClock);
        alarmThread.start();
    }
}
