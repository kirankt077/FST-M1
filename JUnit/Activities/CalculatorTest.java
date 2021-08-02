package JUnit_Practice;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

// The Test class should start or end with "Test"
public class CalculatorTest {

    static CalculatorTest calc;

    @BeforeEach
    public void before() {
    	calc = new CalculatorTest();
    	System.out.println("before");
    }

    @Test
    @DisplayName("Simple multiplication should work")
    public void testMultiply() {
    	System.out.println("multiply");
        assertEquals(20, calc.multiply(4, 5));
    }

	private Integer multiply(int i, int j) {
		// TODO Auto-generated method stub
		System.out.println("null");
		return null;
	}
}