package Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class testKlasseMitFunktion {

	@Test 	
	public void testBuchstabeVoranstellen() {		
			assertEquals("ATest", KlasseMitFunktion.buchstabeVoranstellen("Test", "A"),"Fehler");
		}

}
