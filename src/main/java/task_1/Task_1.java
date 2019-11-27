package task_1;

public class Task_1 {

    public static void main(String[] args) throws MyException {
        checkNumber(-1);
        checkNumber(1);
        checkNumber(0);
    }

    private static void checkNumber(int number) throws MyException {
        if (number < 0) {
            System.out.println("Number < 0");
        } else if (number > 0) {
            System.out.println("Number > 0");
        } else if (number == 0) {
            throw new MyException("Number not = 0");
        }
        System.out.println(number);
    }
}
