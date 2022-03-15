import co.com.sofka.app.calculator.BasicCalculator;
import junit.framework.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

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
}
