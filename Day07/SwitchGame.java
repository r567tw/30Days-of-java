class SwitchGame {
    public static void main(String[] args) {
           int[] grades = {'A','B','C'};
           
           for (int i=0; i<10; i++){
               int grade = grades[(int) (Math.random()*3)];
               
               System.out.print((i+1) + ". ");
               switch (grade){
                    case 'A':
                         System.out.println("Grade A");
                         break;
                    case 'B':
                         System.out.println("Grade B");
                         break;
                    case 'C':
                         System.out.println("Grade C");
                         break;
                    default:
                         System.out.println("Default");
                         break;
               }
           }

    }
}