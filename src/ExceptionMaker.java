public class ExceptionMaker {
    public void generateException(int value) {
        if (value == 1) {
            int x = 10 / 0;
        } else if (value == 2) {
            int[] arr = new int[3];
            int y = arr[5];
        } else {
            System.out.println("No exception thrown.");
        }
    }
}
