import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task_6 {
    private static List<Integer> result = new ArrayList();

    public static void main(String[] args) {
        try {
            readData();
        } catch (Exception ex) {
            System.out.println(result);
        }
    }

    private static void readData() {
        Scanner keyboard = new Scanner(System.in);
        while (true) {
            System.out.print("Enter an integer: ");
            int myInt = keyboard.nextInt();
            result.add(myInt);
        }
    }
}
