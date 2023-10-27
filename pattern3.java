package untitled;

public class pattern3 {
   public pattern3() {
   }

   public static void main(String[] args) {
      pattern(5);
   }

   private static void pattern(int i) {
      for(int row = 0; row < i; ++row) {
         for(int col = i; col > row; --col) {
            System.out.print("* ");
         }

         System.out.println();
      }

   }
}
