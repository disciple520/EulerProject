import java.util.Scanner;


public class EulerProject {

	public static void main(String[] args){
		
		ClearTerminalScreen();
		System.out.println("Euler Project Represent!\n");
		
		int problemNumber = PromptForProblemNumber();
		
		ClearTerminalScreen();
        
		switch (problemNumber) {
			case 1: CalculateAndDisplayAnswerOne();
					break;
			case 2: CalculateAndDisplayAnswerTwo();
					break;
			default: System.out.println("I haven't solved that problem yet!");
					break;
		}
		System.out.println("\nThanks for visiting!\n\n\n\n");
	}
     
		
	public static void CalculateAndDisplayAnswerOne(){
		int answer1 = 0;
		for (int i=1; i<1000; i++){
			if (i%3 == 0 || i%5 == 0) {
				answer1 += i;
			}
		}
		System.out.println("The answer to problem #1 is " + answer1);
	}
	
	public static void CalculateAndDisplayAnswerTwo(){
		int answer2 = 0;
		for (int i=0, j=1, k=0; k<4000001; i=j, j=k ){
			k = j + i;
			if (k%2 == 0){
				answer2 += k;
			}
		}
		System.out.println("The answer to problem #2 is " + answer2);
	}
		
	public static void ClearTerminalScreen() {
		final String ANSI_CLS = "\u001b[2J";
        final String ANSI_HOME = "\u001b[H";
        System.out.print(ANSI_CLS + ANSI_HOME);
        System.out.flush();
	}
	
	public static int PromptForProblemNumber(){
		System.out.println("Which Euler Problem would you like the answer to?");
		Scanner numberScanner = new Scanner(System.in);	
		// Scanner prompts for number until a valid number is entered
		while (!numberScanner.hasNextInt()) {
	       System.out.println("Please enter a valid number");
	       numberScanner.nextLine();
	    }
		int selectedProblem = numberScanner.nextInt();
	    numberScanner.close();
	    return selectedProblem;
	}
	
	
}
// Checking to see if a save needs to be made in order for git to know a file has been modified