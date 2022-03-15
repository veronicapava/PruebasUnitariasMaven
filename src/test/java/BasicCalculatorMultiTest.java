import co.com.sofka.app.calculator.BasicCalculator;
import junit.framework.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BasicCalculatorMultiTest {

    private final BasicCalculator basicCalculator = new BasicCalculator();

    @Test
    @DisplayName("Testing Multiplicacion")
    void multi(){
        // Arrange
        Long number1 = 2L;
        Long number2 = 5L;
        Long expectedValue = 10L;

        // Act
        Long result = basicCalculator.mult(number1, number2);

        // Assert
        Assert.assertEquals(expectedValue, result);

    }

    //Probando la lógica con muchos más casos de prueba
    @DisplayName("Testing several multiplication")
    @ParameterizedTest(name = "{0} * {1} = {2}")
    @CsvSource({
            "3,    5,   15",
            "5,    2,   10",
            "30,  30, 900",
            "26,  85, 2210"
    })
    public void severalMult(Long first, Long second, Long expectedResult) {
        assertEquals(expectedResult, basicCalculator.mult(first, second),
                () -> first + " * " + second + " should equal " + expectedResult);
    }
}
