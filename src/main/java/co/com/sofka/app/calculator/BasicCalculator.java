package co.com.sofka.app.calculator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BasicCalculator {

    private static final Logger logger = LoggerFactory.getLogger(BasicCalculator.class);

    //Suma
    public Long sum(Long number1, Long number2) {
        logger.info( "Sumando {} + {}", number1, number2 );
        return number1 + number2;
    }

    //Resta
    public Long resta(Long number1, Long number2) {
        logger.info( "Restando {} - {}", number1, number2 );
        return  number1 - number2;
    }

    //Multiplicacion

    public Long mult(Long number1, Long number2) {
        logger.info("Multiplicando {} * {}", number1, number2);
        return  number1 * number2;
    }

    //Division
    public Long div(Long number1, Long number2) {
        logger.info("Dividiendo {} / {}", number1, number2);
        if(number2 != 0){
            return  number1 / number2;
        } else {
            System.out.println("No se puede dividir entre 0, ingresa otro numero");
        }
        return 0L;
    }
}
