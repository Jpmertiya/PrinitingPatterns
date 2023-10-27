package untitled;

public class pattern19 {
   public pattern19() {
   }

   public static void main(String[] args) {
      pattern(5);
   }

   private static void pattern(int i) {
      for(int row = 0; row < i; ++row) {
         for(int col = 0; col < i; ++col) {
            if (row != 0 && row != i - 1 && col != 0 && col != i - 1) {
               System.out.print(" ");
            } else {
               System.out.print("*");
            }
         }

         System.out.println();
      }

   }
}