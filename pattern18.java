package untitled;

public class pattern18 {
   public pattern18() {
   }

   public static void main(String[] args) {
      pattern(5);
   }

   private static void pattern(int i) {
      for(int row = 0; row < 2 * i; ++row) {
         int totalSpace = row > i ? i - (row - i) : row;
         int totalCol = row > i ? 2 * i - row : row;

         int col;
         for(col = 0; col < totalCol; ++col) {
            System.out.print("*");
         }

         for(col = i; col > totalSpace; --col) {
            System.out.print("  ");
         }

         for(col = 0; col < totalCol; ++col) {
            System.out.print("*");
         }

         System.out.println();
      }

   }
}

