package jetbrainsacademy;

import java.util.Scanner;

public class timedifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //conversion of start time to seconds
        int startHour = scanner.nextInt() * 3600;
        int startMinute = scanner.nextInt() * 60;
        int startSeconds = scanner.nextInt();

        //conversion of end time in secs
        int endHour = scanner.nextInt() * 3600;
        int endMinute = scanner.nextInt() * 60;
        int endSeconds = scanner.nextInt();

        scanner.close();

        //calculating diff between start time and end time
        int hourDiff = endHour - startHour;
        int minuteDiff = endMinute - startMinute;
        int secondsDiff = endSeconds - startSeconds;

        int totalTime = hourDiff + minuteDiff + secondsDiff;

        System.out.println(totalTime);





    }
    
}