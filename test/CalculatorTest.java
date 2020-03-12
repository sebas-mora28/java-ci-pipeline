import calculator.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void adding() {
        double res = Calculator.adding(4, 50);
        double esperado = 54;
        assertEquals(esperado, res);


    }

    @Test
    void substraction() {
        double res = Calculator.substraction(85, 20);
        double esperado = 65;
        assertEquals(esperado, res);

    }

    @Test
    void multiplication() {
        double res = Calculator.multiplication(40, 2);
        double esperado = 80;
        assertEquals(esperado, res);

    }

    @Test
    void division() {
        double res = Calculator.division(40, 20);
        double esperado = 2;
        assertEquals(esperado, res);


    }
}