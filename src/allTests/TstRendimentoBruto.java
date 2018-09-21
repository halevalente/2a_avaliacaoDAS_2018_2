package allTests;

import static org.junit.Assert.*;

import app.Investimento;


import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


import static org.junit.Assert.assertEquals;


@RunWith(Parameterized.class)
public class TstRendimentoBruto {

	private Integer dias_n;
	private Float valor_p;
	private Float taxa_i;
	private Float aliquota_d;
	private Float rendimentoBruto;
	
	@Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][] {
        										{ (int)60 , (float)1000.0, (float)8.5, (float)22.5, (float)13.97 },
        										{ (int)270 , (float)2000.0, (float)8.5, (float)20.0, (float)125.75 },
        										{ (int)270 , (float)2000.0, (float)8.5, (float)20.0, (float)125.75 }
        									};
        return Arrays.asList(data);
    }
	
	
	@Test
    public void testeContaCriada() {
		Investimento investimento = Investimento.obterInvestimento(dias_n, valor_p, taxa_i, aliquota_d);
		
        assertEquals(rendimentoBruto, investimento.getRendimentoBruto(), 0.1);
    }
	
}
