import java.util.Scanner;
public class WhatToEat {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		String vacationType;
		int groupSize;
		String result = ("vacationType" + "groupSize" + "destinationSuggestions");
		String modeOfTransportation = "placeholder";
		
		System.out.print("What kind of trip would you like to go on, musical, tropical, or adventurous? ");
		vacationType = keyboard.next();
		System.out.print("How many are in your group? ");
		groupSize = keyboard.nextInt();
		
		
		if (groupSize <= 2) {
			modeOfTransportation = ("first class trip");
		} else if (groupSize >= 3 && groupSize <= 5) {
			modeOfTransportation = ("helicopter");
		} else if (groupSize >= 6) {
			modeOfTransportation = ("charter fight");
		} 
		
		
		if (vacationType.equalsIgnoreCase("musical")) {
			System.out.print("Since you’re a group of " + groupSize + " going on a musical vacation, you should take a ");
			System.out.println(modeOfTransportation + " to New Orleans.");
			
		}  else if (vacationType.equalsIgnoreCase("tropical")) {
			System.out.print("Since you’re a group of " + groupSize + " going on a tropical vacation, you should take a ");
			System.out.println(modeOfTransportation + " to a beach vacation in Mexico.");
			
		} else if (vacationType.equalsIgnoreCase("adventurous")) {
			System.out.print("Since you’re a group of " + groupSize + " going on an adventurous vacation, you should take a ");
			System.out.println(modeOfTransportation + " to whitewater rafting the Grand Canyon.");
		} 
		
		
	}

}
