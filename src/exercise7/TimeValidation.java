package exercise7;

import java.util.Scanner;

public class TimeValidation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter hours: ");
        int hours = input.nextInt();
        boolean timeValid = false;
        timeValid = areHoursValid(hours); 
        System.out.print("Enter minutes: ");
        int minutes = input.nextInt();
          if (timeValid) {
          timeValid = areMinutesValid(minutes);
        } 
        System.out.println("Time valid: " + timeValid);
    }

    public static boolean areHoursValid(int hours) {
        if (hours > 23 || hours < 0){
          return false;
        }
        else {
          return true;
        }
    }

    public static boolean areMinutesValid(int minutes) {
        if(minutes > 59 || minutes < 0) {
          return false;
        }
        else {
          return true;
        }
    }
}
