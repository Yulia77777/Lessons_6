public class Task_5 {
    public static void main(String[] args) {
        try {
            iCanThrowException();
        } catch (NullPointerException e) {
            System.out.println("Catching NullPointerException");
        }
    }

    private static void iCanThrowException() {
        throw new NullPointerException();
    }
}
