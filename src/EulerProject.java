//import java.util.Scanner;


public class EulerProject {

	public static void main(String[] args){
		
		System.out.println("Euler Project Represent!");
/*		System.out.println("Euler Project Represent!\nWhich Euler Problem would you like the answer to?");
		Scanner myScanner = new Scanner(System.in);
		//displays error multiple times if multiple words are typed
		while (!myScanner.hasNextInt()) {
	        System.out.println("Please enter a valid number");
	        myScanner.next();
	    }
	      int selectedProblem = myScanner.nextInt();
	        System.out.println("The typed integer is " + selectedProblem);
*/	     
	     
		
		int answer1 = 0;
		for (int i=1; i<1000; i++){
			if (i%3 == 0 || i%5 == 0) {
				answer1 += i;
			}
		}
		System.out.println("The answer to problem #1 is " + answer1);
		int answer2 = 0;
		for (int i=0, j=1, k=0; k<4000001; i=j, j=k ){
			k = j + i;
			if (k%2 == 0){
				answer2 += k;
			}
		}

		System.out.println("The answer to problem #2 is " + answer2);
	}
	
}
// Checking to see if a save needs to be made in order for git to know a file has been modified