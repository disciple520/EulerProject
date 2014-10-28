import static org.junit.Assert.*;

import org.junit.Test;


public class EulerProjectTest {

	@Test
	public void test() {
		assert(true);
	}
	
	@Test
	public void testWhetherAnswerOneCalculatesCorrectly() {
		//given
		
		//when
		int answer = EulerProject.CalculateAndDisplayAnswerOne();
		
		//then
		assert(answer == 233168);
	}

}
