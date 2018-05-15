package exemplo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Teste {
	
	static final Logger logger = LogManager.getLogger(Teste.class.getName());

	public static void main(String[] args) {
		
		//System.out.println("******Iniciou a execução******");
		logger.trace("Iniciou a execução.");
		
		
		Calculadora calc = new Calculadora();
		
		
		System.out.println(calc.soma(10, 5));
		
		System.out.println(calc.multiplicacao(16, 3));
		
		System.out.println(calc.divisao(10, 0));
		//System.out.println("******Executou tudão!!!!!******");
		logger.info("Executou todo mundo!");

	}

}
