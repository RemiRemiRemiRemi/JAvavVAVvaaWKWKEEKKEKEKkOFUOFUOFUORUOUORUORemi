//C'est moi, Remi!
//Remi-Laurent Guy, 2/25/25

/*This program is going to have this stuff:

You need to use modular division 
and the symbol in java is the % sign.   
Given a 3-digit number 258. Create code to output the following: 
The hundreds-place digit is: 2
The tens-place digit is: 5

The one's digit is: 8

You may not just print out the digits. You must figure out an algorithm to isolate each digit.

*/

public class digitsRemi{
    public static void main(String[]args){





int number;
int ones;
int tens;
int hundreds;

number = 258;
ones = number % 10;
tens = (number / 10) % 10;
hundreds =  ((number / 10)/10) % 10;

    
System.out.println(hundreds);
System.out.println(tens);
System.out.println(ones);


    }
}