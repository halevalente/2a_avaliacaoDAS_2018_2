package allTests;

import static org.junit.Assert.*;
import org.junit.*;

import app.Investimento;


public class TstRendimentoBruto {

	@Test
    public void testeContaCriada() {
		Investimento investimento = Investimento.obterInvestimento((int)60, (float)1000.0, (float)8.5, (float)22.5);
		
        assertEquals(13.97, investimento.getRendimentoBruto(), 0.1);
    }
	
}
