package ch7;

import java.util.Scanner;public class TryToParse{
public static void main(String[] args) {
Scanner keys = new Scanner(System.in);int intInput =0;
try
{
System.out.println("Enter input: ");String input = keys.nextLine();
intInput =Integer.parseInt(input);}
catch(NumberFormatException Exception){
System.out.println("Error: Input is not an integer.");System.exit(0);
}
System.out.println("Input: "+intInput);
}
}