public class Main {
    public static void main(String[] args) {
        ExceptionMaker maker = new ExceptionMaker();

        try {
            maker.generateException(1);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught!");
            e.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught!");
            e.printStackTrace();
        } finally {
            System.out.println("Finally block executed.");
        }
    }
}
