package unittest.io.quind.tests;

import io.quind.basiccalculatorapi.domain.Calculator;
import org.junit.Assert;
import org.junit.Test;

public class BasicArithmeticOperationsUnitTest {

    @Test
    public void calculateTheSumOfTwoNumbersCorrectly(){
        //Arrange
        int number1 = 1;
        int number2 = 2;
        Calculator calculator = new Calculator();

        //Act
        int result = calculator.sum(number1, number2);

        //Assert
        Assert.assertEquals(3, result);
    }
}
