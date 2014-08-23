
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
