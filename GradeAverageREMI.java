//Remiiiiiiiiiiiiiiiiiiiiiiiiii-Laurent Guy

import java.util.*;

public class GradeAverageREMI {
    public static void main(String[]args){




int grade;
int grade2;
int grade3;
int grade4;
int grade5;
double average;


Scanner input = new Scanner(System.in);
//You gotta prompt the user for the grades I guess
System.out.println("Enter grade pls");

grade = input.nextInt();

System.out.println("your got a " + grade + "? that's pretty bad ngl");

System.out.println("Enter your friend's grade pls");

grade2 = input.nextInt();

System.out.println("your friend got a " + grade2 + "? you gotta get to your friend's level man");

System.out.println("Enter another friend's grade pls");

grade3 = input.nextInt();

System.out.println("your other friend got a " + grade3 + "? you gotta get to your other friend's level man");

System.out.println("Enter another friend's grade pls");

grade4 = input.nextInt();

System.out.println("your other friend got a " + grade4 + "? you gotta get to your other friend's level man");

System.out.println("Enter another friend's grade pls");

grade5 = input.nextInt();

System.out.println("your other friend got a " + grade5 + "? you gotta get to your other friend's level man");

average = (grade + grade2 + grade3 + grade4 + grade5)/5;
System.out.println("The average of all of your awful grades is " + average);
    }
}
