
//Remiiiiiiiiiiiiiiiiiiiiiiiii-Laurent Guy
//3/5/25

import java.util.*;

public class TimeConversionRemi {
    public static void main(String[]args){

long minutes;
long hourTime;
long minuteTime;

Scanner input = new Scanner(System.in);

System.out.println("How many minutes??????????????");

minutes = input.nextLong();

hourTime = minutes / 60;
minuteTime = minutes % 60;

System.out.println("The time is: " + hourTime + ":" + minuteTime);

    }
}