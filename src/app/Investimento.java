package app;

import app.Calculadora;

public class Investimento {
	
	private Integer dias_n;
	private Float valor_p;
	private Float taxa_i;
	private Float aliquota_d;
	
	private Float rendimentoBruto;
	private Float impostoDeRenda;
	private Float rendimentoLiquido;
	
	private Calculadora calculadora = new Calculadora();
	
	Investimento(Integer dias_n, Float valor_p, Float taxa_i, Float aliquota_d) {
		this.dias_n = dias_n;
		this.valor_p = valor_p;
		this.taxa_i = taxa_i;
		this.aliquota_d = aliquota_d;
	}
	
	public Float getRendimentoBruto() {
		rendimentoBruto = calculadora.calcRendimentoBruto(dias_n, valor_p, taxa_i, aliquota_d);
		return rendimentoBruto;
	}

	public Float getImpostoDeRenda() {
		return impostoDeRenda;
	}

	public Float getRendimentoLiquido() {
		return rendimentoLiquido;
	}
	
	public static Investimento obterInvestimento(Integer dias_n, Float valor_p, Float taxa_i, Float aliquota_d){
		Investimento c = new Investimento(dias_n, valor_p, taxa_i, aliquota_d);
		return c;
	}
}
