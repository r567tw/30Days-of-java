public class Calculator {

    // 重載方法，接受兩個 int 類型的參數
    public int add(int a, int b) {
        return a + b;
    }

    // 重載方法，接受三個 int 類型的參數
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // 重載方法，接受兩個 double 類型的參數
    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // 使用不同的 add 方法
        System.out.println("add(int, int): " + calc.add(3, 4));            // 呼叫 add(int, int)
        System.out.println("add(int, int, int): " + calc.add(3, 4, 5));     // 呼叫 add(int, int, int)
        System.out.println("add(double, double): " + calc.add(3.5, 4.2));   // 呼叫 add(double, double)
    }
}
