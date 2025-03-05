//Remi-Laurent Guy, 3/4/25

import java.util.Scanner;
import java.util.*;
import java.text.NumberFormat;

public class ElecyRemi {
    public static void main(String[]args){


String name1;
String name2;
double votes1;
double votes2;
double total;

Scanner input = new Scanner(System.in);

System.out.println("What's the candidate's name?");
name1 = input.next();

System.out.println("nice");

System.out.println("What's the second candidate's name?");
name2 = input.next();

System.out.println("alright");

System.out.println("How many votes did the first candidate get?");
votes1 = input.nextDouble();

System.out.println("How many votes did the second candidate get?");
votes2 = input.nextDouble();

total = votes1 + votes2;
NumberFormat percent = NumberFormat.getPercentInstance();

System.out.println("Here are the results!");
System.out.println("Candidate\tVotes\tPercentage");
System.out.println(name1 + "\t" + votes1 + "\t" + (percent.format(votes1/100)));
System.out.println(name2 + "\t" + votes2 + "\t" + (percent.format(votes2/100)));




    }
}
