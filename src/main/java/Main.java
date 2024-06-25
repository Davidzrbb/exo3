import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java Main <filename> <operation>");
            return;
        }

        String filename = args[0];
        String operation = args[1];

        try {
            CSVProcessor csvProcessor = new CSVProcessor(filename);
            Calculator calculator = new Calculator();
            System.out.println("filename: " + calculator);
            switch (operation) {
                case "+":
                    calculator.addition(csvProcessor.getNumbers());
                    break;
                case "*":
                    calculator.multiplication(csvProcessor.getNumbers());
                    break;
                default:
                    System.out.println("Unsupported operation: " + operation);
            }
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
}
