package Model;



import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ProvaTest {

	@Test
	public void test() {
		
		Prova p = new Prova();
		
		assertEquals(p.somma(3, 2), 5);
	}

}
