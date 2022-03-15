package co.com.sofka.app.calculator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    private static final Logger logger = LoggerFactory.getLogger( App.class );

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader( new InputStreamReader( System.in ) );

        System.out.println( "Enter number 1: " );
        String textNumber1 = bufferedReader.readLine();

        System.out.println( "Enter number 2: " );
        String textNumber2 = bufferedReader.readLine();

        Long number1 = Long.valueOf( textNumber1 );
        Long number2 = Long.valueOf( textNumber2 );

        BasicCalculator calculator = new BasicCalculator();

        //Suma
        Long resultSum = calculator.sum( number1, number2 );
        System.out.println( number1 + " + " + number2 + " = " + resultSum );

        //Resta
        Long resultRest = calculator.resta( number1, number2 );
        System.out.println( number1 + " - " + number2 + " = " + resultRest );

        //Multiplicacion
        Long resultMul = calculator.mult( number1, number2 );
        System.out.println( number1 + " * " + number2 + " = " + resultMul );

        //Division
        Long resultDiv = calculator.div( number1, number2 );
        System.out.println( number1 + " / " + number2 + " = " + resultDiv );
    }
}
