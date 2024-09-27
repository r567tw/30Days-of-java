import java.util.Random;
import java.util.Scanner;

class GuessNumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        // 隨機生成一個 1 到 100 的數字
        int targetNumber = random.nextInt(100) + 1;
        int guess;
        int attempts = 0;
        
        System.out.println("歡迎來到猜數字遊戲！");
        System.out.println("我已經想好了一個 1 到 100 之間的數字。");
        System.out.println("試著猜出這個數字吧！");

        // 讓使用者一直猜，直到猜中為止
        do {
            System.out.print("請輸入你的猜測：");
            guess = scanner.nextInt();
            attempts++;

            if (guess > targetNumber) {
                System.out.println("太高了！");
            } else if (guess < targetNumber) {
                System.out.println("太低了！");
            } else {
                System.out.println("恭喜！你猜中了！");
                System.out.println("你一共猜了 " + attempts + " 次。");
            }
        } while (guess != targetNumber);
        
        scanner.close();
    }
}
