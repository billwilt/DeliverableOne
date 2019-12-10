import java.util.Scanner;
public class DeliverableTwo {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		
		String input; //Users keyboard input
		String message;
		int checksum = 0;
		int count = 0;
		
		//Get input from keyboard
		System.out.print("What is your message? ");
		input = keyboard.next();
		int inputLength = input.length();
		
		//Convert input to upper case
		message = (input.toUpperCase());
		
		//Convert letters to numbers
		while (count < inputLength) {
			//System.out.println(input.charAt(count));
			char c = (message.charAt(count));
			int i = (int)c;
			//System.out.println(i);
			checksum = checksum + i;
			System.out.print(i - 64 + "-");
			count = count + 1;
		}
		
		System.out.println();
		System.out.println("Message checksum is: " + checksum);
	}

}
