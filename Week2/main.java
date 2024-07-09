import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(5);
        numbers.add(8);
        numbers.add(10);
        System.out.println("Numbers: " + numbers);

        for (int number : numbers) {
            int square = number * number;
            System.out.println("Square of " + number + " is: " + square);
        }
    }
}
