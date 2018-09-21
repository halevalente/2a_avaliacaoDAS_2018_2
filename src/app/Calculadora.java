package app;

public class Calculadora {
	
	public Float calcRendimentoBruto(Integer dias_n, Float valor_p, Float taxa_i, Float aliquota_d) {
		
		Float rendimento = ((float)dias_n/(float)365.0)/100 * taxa_i * valor_p;
		return rendimento;
	}
}
