package edu.cofc.tylergray;

import java.util.Scanner;

public class HW1Part2 {

	public static void main(String[] args) {
		//TODO all of it
		//Variables
		boolean num1Valid = false;
		boolean num2Valid = false;
		String num1 = "";
		String num2 = "";
		String total = "";
		//Instantiates Objects
		Scanner sc = new Scanner(System.in);
		//Get User Input
		while(!num1Valid) {
			System.out.println("Please enter the first number for calculation");
			num1 = sc.nextLine();
			if(checkIfAllDigits(num1)) {
				num1Valid = true;
			}
			else {
				System.out.println("ERROR: INPUT WASN'T A VALID NUMBER");
				
			}
		}
		while(!num2Valid) {
			System.out.println("Please enter the second number for calculation");
			num2 = sc.nextLine();
			if(checkIfAllDigits(num2)) {
				num2Valid = true;
			}
			else {
				System.out.println("ERROR: INPUT WASN'T A VALID NUMBER");
				
			}
		}
		
		if(num1.length() < num2.length()) {
			num1 = padWithZero(num1, num2.length()-num1.length());
		}
		else {
			num2 = padWithZero(num2, num1.length()-num2.length());
		}
		  
		//System.out.println(num1 + "\n" + num2);
		int cOv = 0;
		for(int i = num1.length(); i > 0 ; i--) {
			
		}
		

	}//End Main
	
	public static boolean checkIfAllDigits(String s) {
		
		//Loop through String
		for(int i = 0; i < s.length(); i++) {
			if(!Character.isDigit(s.charAt(i))) {
				//If it isnt a digit, return false
				return false;
			}//End If
		}//End For
		return true;
	}//End CheckIfAllDigits
	
	public static String padWithZero(String s, int length) {
		
		String zeros = "0";
		for(int i = 0; i < length-1; i++) {
			zeros += '0';
		}
		return zeros + s;
	}

}//End Class
