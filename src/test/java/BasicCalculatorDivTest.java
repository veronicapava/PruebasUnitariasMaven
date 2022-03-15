import co.com.sofka.app.calculator.BasicCalculator;
import junit.framework.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BasicCalculatorDivTest {
    private final BasicCalculator basicCalculator = new BasicCalculator();

    @Test
    @DisplayName("Testing division")
    void division(){
        // Arrange
        Long number1 = 10L;
        Long number2 = 2L;
        Long expectedValue = 5L;

        // Act
        Long result = basicCalculator.div(number1, number2);

        // Assert
        Assert.assertEquals(expectedValue, result);
    }

    //Probando la lógica con muchos más casos de prueba
    @DisplayName("Testing several divitiones")
    @ParameterizedTest(name = "{0} / {1} = {2}")
    @CsvSource({
            "30,    2,   15",
            "23,    2,   11,5",
            "10,  10, 1",
            "40,  2, 20"
    })
    public void severalDiv(Long first, Long second, Long expectedResult) {
        assertEquals(expectedResult, basicCalculator.div(first, second),
                () -> first + " / " + second + " should equal " + expectedResult);
    }
}
