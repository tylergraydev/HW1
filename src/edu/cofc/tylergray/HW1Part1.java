package edu.cofc.tylergray;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class HW1Part1 {

	//Vars
	private String userInput;
	private int sylCount;
	private String vowels = "abcdef";
	private ArrayList<Integer> indOfVow[];
	
	//Objs
	public void main() {
		@SuppressWarnings("resource")
		ArrayList<Integer> indOfVow = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		userInput = sc.nextLine();
		userInput = userInput.trim();
		userInput.toLowerCase();
		//Check if Valid
		//TODO
		//Iterate over string
		for(int i = 0; i < userInput.length()-1; i++) {
			if(vowels.indexOf(userInput.charAt(i)) != -1) {
				indOfVow.add(i);
			}
			
		}//End For
		for(int i = 0; i < indOfVow.size(); i++) {
			if(indOfVow.get(i) != indOfVow.get(i)+1) {
				sylCount ++;
			}
		}
		
		System.out.printf("%s has %d number of syllabulls", userInput, sylCount);

		
	}//End Main
	
	
}//End Class
