import java.util.Scanner;

class Temperature {
    public static void main(String[] args) {
        // 華氏温度 = (9/5) * 攝氏温度+32
        // Enter a degree in Celsius: 43
        // 43 Celsius is 109.4 Fahrenheit

        System.out.print("Enter a degree in Fahrenheit(華氏): ");
        Scanner input = new Scanner(System.in);
        double degree = input.nextDouble();
        double result = (degree - 32)*5/9;
        System.out.println(String.format("%.2f",degree) + " Fahrenheit = " + String.format("%.2f",result) + " Celsius Degree");
    }
}