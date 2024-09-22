import java.util.Scanner;

class WhileGame {
    public static void main(String[] args) {
           System.out.print("請輸入你要輪迴的次數： ");
           Scanner input = new Scanner(System.in);
           int times = input.nextInt();

           while (times > 0){
             System.out.println(times);
             times = times - 1;
           }

           System.out.println("Out of loop: "+ times);

    }
}