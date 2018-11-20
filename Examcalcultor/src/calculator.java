import java.util.Scanner;
public class calculator {

	public static void main(String[] args) {
		Scanner Keyboard = new Scanner(System.in);
		
		String input = "";
		
		do
		{
			System.out.println("Enter in exam scores and when you're finished, enter a negative value");
			int grade = Keyboard.nextInt();
			int average = 0;
			int gradeCounter = 0;
			
			while (grade >= 0)
			{
				average +=grade;
				gradeCounter++;
				System.out.println("Enter another grade or a negative value to quit");
				grade = Keyboard.nextInt();
				Keyboard.nextLine();
				
			}
			average = average / gradeCounter;
			System.out.println("The average grade is " + average);
			
			System.out.println("Enter \"enter\" to continue or \"Quit\" to quit");
		}
		while (input.equalsIgnoreCase("quit") == false);
		System.out.println("Good bye");
	}

}
