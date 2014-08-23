
public class EulerProject {

	public static void main(String[] args){
		System.out.println("Euler Project Represent!");
		int answer1 = 0;
		for (int i=1; i<1000; i++){
			if (i%3 == 0 || i%5 == 0) {
				answer1 += i;
			}
		}
		System.out.println("The answer to problem #1 is " + answer1);
	}
	
}
