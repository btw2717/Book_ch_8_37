import java.util.Scanner;
import java.util.Random;

public class Capitals {
	public static void main(String[] args) {
		
		int guesses = 0;
		Random rand = new Random();
		int stateIndex;
		boolean more = true;
		String answer;
		Scanner keyboard = new Scanner(System.in);
		Scanner decide = new Scanner(System.in);


		String[][] data = { {"Alabama", "Alaska", "Arizona", "Arkansas", "California", "Colorado", "Connecticut", "Delaware", "Florida", "Georgia", "Hawaii", "Idaho", "Illinois", "Indiana", "Iowa", "Kansas", "Kentucky", "Louisiana", "Maine", "Maryland", "Massachusetts", "Michigan", "Minnesota", "Mississippi", "Missouri", "Montana", "Nebraska", "Nevada", "New Hampshire", "New Jersey", "New Mexico", "New York", "North Carolina", "North Dakota", "Ohio", "Oklahoma", "Oregon", "Pennsylvania", "Rhode Island", "South Carolina", "South Dakota", "Tennessee", "Texas", "Utah", "Vermont", "Virginia", "Washington", "West Virginia", "Wisconsin", "Wyoming"}, {"Montgomery", "Juneau", "Phoenix", "Little Rock", "Sacramento", "Denver", "Hartford", "Dover", "Tallahassee", "Atlanta", "Honolulu", "Boise", "Springfield", "Indianapolis", "Des Moines", "Topeka", "Frankfort", "Baton Rouge", "Augusta", "Annapolis", "Boston", "Lansing", "St. Paul", "Jackson", "Jefferson City", "Helena", "Lincoln", "Carson City", "Concord", "Trenton", "Santa Fe", "Albany", "Raleigh", "Bismarck", "Columbus", "Oklahoma City", "Salem", "Harrisburg", "Providence", "Columbia", "Pierre", "Nashville", "Austin", "Salt Lake City", "Montpelier", "Richmond", "Olympia", "Charleston", "Madison", "Cheyenne"} };

	//	System.out.println("state length " + data[0].length + " capital length " + data[1].length);

		System.out.println("Let's play a game.  I'll randomly pick a state and you tell me the capital.  3 strikes you're out. Enter \'quit\' to quit");
				System.out.println();
		while((guesses < 3) && (more)) {
		
			stateIndex = rand.nextInt(50);
			System.out.print("what is the capital of: " + data[0][stateIndex] + " > ");
			answer = keyboard.nextLine();
			if(answer.equalsIgnoreCase(data[1][stateIndex])) {
				System.out.println("You got it!");
				System.out.println();
			} else if(answer.equalsIgnoreCase("quit")) {
				more = false;
			} else {
				System.out.println();
				System.out.println("NOPE, we'll come back to it");
				guesses++;
				System.out.println("you have used " + guesses + " guesses.");
				System.out.println();
				if(guesses == 3){
					System.out.println("You are out! Would you like to play again? y/n >");
					String again = decide.next();
					System.out.println();
					if(again.equalsIgnoreCase("y"))
						guesses = 0;
					else
						guesses = 3;
				}
			}

		} 
		System.out.println("See you next time");
		keyboard.close();
		decide.close();


	}
}
