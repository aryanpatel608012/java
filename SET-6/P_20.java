public class Main {
    public static void main(String[] args) {
        try {
            int num = Integer.parseInt(args[0]);
            int den = Integer.parseInt(args[1]);

            int result = num / den;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Divide by zero error");
        } catch (Exception e) {
            System.out.println("Invalid input");
        }
    }
}
