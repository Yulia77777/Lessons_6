public class Task_2 {
    public static void main(String[] args) {
        System.out.println(divideByZero());
    }

    private static String divideByZero() {
        int a = 5;
        int b = 0;
        try {
            return String.valueOf(a / b);
        } catch (ArithmeticException e) {
            return "Error when dividing by zero";
        }
    }
}

