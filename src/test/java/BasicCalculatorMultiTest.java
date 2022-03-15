import co.com.sofka.app.calculator.BasicCalculator;
import junit.framework.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

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
}
