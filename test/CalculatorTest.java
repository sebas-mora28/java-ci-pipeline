import calculator.Calculator;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void adding() {
        double res = Calculator.adding(2, 50);

        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);


        List<Integer> esperado = new ArrayList<Integer>();
        esperado.add(4);
        esperado.add(2);
        esperado.add(1);
        esperado.add(3);




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