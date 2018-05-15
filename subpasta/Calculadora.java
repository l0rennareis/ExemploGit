package exemplo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculadora {
	
	final Logger logger = LogManager.getLogger(Calculadora.class.getName());
	
	public double divisao(double a, double b){
		if(b !=0){
			return a / b;
		} else {
			logger.warn("Denominador igual a zero.");
			return 0;
		}
	}
	
	public double multiplicacao(double a, double b){
		//System.out.println("******Entrou na multiplicação!!!!!******");
		logger.trace("Entrou na multiplicação.");
		return a * b;
	}
	public double soma(double a, double b){
		return a + b;
	}
	public double subtracao(double a, double b){
		return a - b;
	}
}
