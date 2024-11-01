public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        
        try {
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("錯誤：不能除以零！");
        } finally {
            System.out.println("運算結束。");
        }
    }
}
