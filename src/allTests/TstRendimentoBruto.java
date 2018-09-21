package allTests;

import static org.junit.Assert.*;
import org.junit.*;

import app.Investimento;


public class TstRendimentoBruto {

	@Test
    public void testeContaCriada() {
		Investimento investimento = Investimento.obterInvestimento((int)120, (float)500.0, (float)8.0, (float)22.5);
		
        assertEquals(13.15, investimento.getRendimentoBruto(), 0.1);
    }
	
}
