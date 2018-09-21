package allTests;

import static org.junit.Assert.*;
import org.junit.*;

import app.Investimento;


public class TstRendimentoBruto {

	@Test
    public void testeContaCriada() {
		Investimento investimento = Investimento.obterInvestimento((int)270, (float)2000.0, (float)8.5, (float)20.0);
		
        assertEquals(125.75, investimento.getRendimentoBruto(), 0.1);
    }
	
}
