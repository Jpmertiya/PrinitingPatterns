package untitled;

public class pattern8 {
   public pattern8() {
   }

   public static void main(String[] args) {
      pattern(5);
   }

   private static void pattern(int i) {
      for(int row = 0; row < i; ++row) {
         int col;
         for(col = i; col > row; --col) {
            System.out.print(" ");
         }

         for(col = 0; col <= row; ++col) {
            System.out.print("* ");
         }

         System.out.println();
      }

   }
}
