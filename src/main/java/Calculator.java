import java.util.List;

public class Calculator {

    public void addition(List<Integer> numbers) {
        int total = 0;
        StringBuilder output = new StringBuilder();

        for (int number : numbers) {
            if (output.length() > 0) {
                output.append(" + ");
            }
            output.append(number);
            total += number;
            System.out.println(output.toString() + " (=" + total + ")");
        }
        System.out.println("-------");
        System.out.println("total = " + total + " (addition)");
    }

    public void multiplication(List<Integer> numbers) {
        int total = 1;
        StringBuilder output = new StringBuilder();

        for (int number : numbers) {
            if (output.length() > 0) {
                output.append(" * ");
            }
            output.append(number);
            total *= number;
            System.out.println(output.toString() + " (=" + total + ")");
        }
        System.out.println("-------");
        System.out.println("total = " + total + " (multiplication)");
    }
}
