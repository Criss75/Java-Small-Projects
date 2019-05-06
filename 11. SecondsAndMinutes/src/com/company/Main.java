package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(getDurationString(65,45));

        System.out.println(getDurationString(3945));
    }
    public static String getDurationString (int minutes, int seconds) {
        if (minutes >= 0 && seconds >= 0 && seconds <=59) {
            int hours = minutes/60;
            int remainingMinutes = minutes % 60;
            String strHours = hours + "h";
            if (hours < 10) {
                strHours = "0" + String.valueOf(hours) + "h";
            }
            String strMinutes = minutes + "m";
            if (remainingMinutes < 10) {
                strMinutes = "0" + String.valueOf(remainingMinutes) + "m";
            }
            String strSeconds = seconds + "s";
            if (seconds < 10) {
                strSeconds = "0" + String.valueOf(seconds);
            }
            return strHours + strMinutes + strSeconds;
         } return "Invalid value";
    }

    public static String getDurationString (int seconds) {
            if (seconds < 0) {
                return "Invalid value";
            }
        int minutesInSeconds = seconds / 60;
        int remainingSeconds = seconds % 60;
        return getDurationString(minutesInSeconds, remainingSeconds);
    }

}
