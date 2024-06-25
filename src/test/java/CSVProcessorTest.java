import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CSVProcessorTest {

    @Test
    public void testGetNumbers() throws IOException {
        CSVProcessor csvProcessor = new CSVProcessor("test_numbers.csv");
        List<Integer> numbers = csvProcessor.getNumbers();
        assertEquals(List.of(1, 2, 3), numbers);
    }
}
