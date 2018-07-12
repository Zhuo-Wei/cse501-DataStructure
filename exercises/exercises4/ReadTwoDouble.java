package exercises4;

import sedgewick.StdIn;


public class ReadTwoDouble {
	
	public static void main(String[] args) {
		
		System.out.println("Please enter your name:");
		String name = StdIn.readString();
		System.out.println("Please enter your age:");
		int age = StdIn.readInt();
		if(age<0) {
			System.out.println("Age cannot be negative, please enter your age:");
			age=StdIn.readInt(); 
		}
		
		System.out.println("Your name is " + name+", and you are " + age+" years old.");
		
	}

}
//Using StdIn (NOT Argsprocessor!),
//prompt the user to enter their name. 
//Then, prompt the user to enter their age. If the user enters an age less than 0, 
//continue prompting them for their age until they give an age greater than zero. 
//Finally, print out a greeting to the user that includes their name and age (.
