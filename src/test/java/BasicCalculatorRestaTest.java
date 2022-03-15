import co.com.sofka.app.calculator.BasicCalculator;
import junit.framework.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BasicCalculatorRestaTest {
    private final BasicCalculator basicCalculator = new BasicCalculator();
    @Test
    @DisplayName("Testing resta")
    void resta(){
        // Arrange
        Long number1 = 20L;
        Long number2 = 10L;
        Long expectedValue = 10L;

        // Act
        Long result = basicCalculator.resta(number1, number2);

        // Assert
        Assert.assertEquals(expectedValue, result);
    }
    //Probando la lógica con muchos más casos de prueba
    @DisplayName("Testing several rest")
    @ParameterizedTest(name = "{0} - {1} = {2}")
    @CsvSource({
            "1,    1,   0",
            "5,    2,   3",
            "100,  75, 25",
            "1001,  1, 1000"
    })
    public void severalRest(Long first, Long second, Long expectedResult) {
        assertEquals(expectedResult, basicCalculator.resta(first, second),
                () -> first + " - " + second + " should equal " + expectedResult);
    }
}
