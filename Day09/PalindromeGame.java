import java.util.Scanner;

class PalindromeGame {
    public static void main(String[] args) {
      System.out.print("請輸入字串： ");
      Scanner input = new Scanner(System.in);
      String text = input.nextLine();

      System.out.println("text is "+ text);

      int length = text.length();
      boolean isPalindrome = true;

      System.out.println("min is "+ length/2);

      for (int i=0; i< length/2; i++){
        if (text.charAt(i) != text.charAt(length-i-1)){
          isPalindrome = false;
        }
      }

      if (isPalindrome){
        System.out.println(text + " is Palindrome.");
      } else {
        System.out.println(text + " is Not Palindrome");
      }

      

    }
}