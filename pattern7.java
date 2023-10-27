package untitled;

public class pattern7 {
   public pattern7() {
   }

   public static void main(String[] args) {
      pattern(5);
   }

   private static void pattern(int i) {
      for(int row = 0; row < i; ++row) {
         int col;
         for(col = 0; col < row; ++col) {
            System.out.print(" ");
         }

         for(col = i; col > row; --col) {
            System.out.print("*");
         }

         System.out.println();
      }

   }
}
