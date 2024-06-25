import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    public void testAddition() {
        Calculator calculator = new Calculator();
        List<Integer> numbers = List.of(1, 2, 3);

        // Capture the output
        String output = captureOutput(() -> calculator.addition(numbers));

        String expectedOutput = "1 (=1)\n1 + 2 (=3)\n1 + 2 + 3 (=6)\n-------\ntotal = 6 (addition)\n";
        assertEquals(expectedOutput, output);
    }

    @Test
    public void testMultiplication() {
        Calculator calculator = new Calculator();
        List<Integer> numbers = List.of(1, 2, 3);

        // Capture the output
        String output = captureOutput(() -> calculator.multiplication(numbers));

        String expectedOutput = "1 (=1)\n1 * 2 (=2)\n1 * 2 * 3 (=6)\n-------\ntotal = 6 (multiplication)\n";
        assertEquals(expectedOutput, output);
    }

    private String captureOutput(Runnable runnable) {
        java.io.ByteArrayOutputStream out = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(out));
        runnable.run();
        return out.toString();
    }
}
