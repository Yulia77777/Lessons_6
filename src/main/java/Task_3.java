public class Task_3 {

    public static void main(String[] args) {
        int a = args.length;
        System.out.println(a);
        handleArithmeticException(a);
        handleArrayIndexOutOfBoundsException();
    }

    private static void handleArrayIndexOutOfBoundsException() {
        int[] c = {1};
        try {
            System.out.println(c[1]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("ArrayIndexOutOfBoundsException, because your array does not have that many elements as you request");
        }
    }

    private static void handleArithmeticException(int a) {
        try {
            int b = 10 / a;
        } catch (ArithmeticException ex) {
            System.out.println("Division by zero, because there are no input parameters. Please enter at least one input parameter");
        }
    }
}

