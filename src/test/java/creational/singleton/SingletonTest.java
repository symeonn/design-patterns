package creational.singleton;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * 
 * @author Mariusz Lewandowski; byMario.pl
 */
public class SingletonTest {

	@Test
	public void test() {
		
		Singleton singl1 = Singleton.getInstance(); 
		Singleton singl2 = Singleton.getInstance(); 
		assertTrue(singl1 == singl2);

		singl1 = singl2;
		assertTrue(singl1 == singl2);
	}

}
