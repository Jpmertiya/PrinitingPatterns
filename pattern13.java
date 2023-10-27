package untitled;

public class pattern13 {
   public pattern13() {
   }

   public static void main(String[] args) {
      pattern(5);
   }

   private static void pattern(int i) {
      for(int row = 0; row < 2 * i; ++row) {
         int totalSpace = row > i ? i - (row - i) : row;

         int totalCol;
         for(totalCol = i; totalCol > totalSpace; --totalCol) {
            System.out.print(" ");
         }

         totalCol = row > i ? 2 * i - row : row;

         for(int col = 0; col < totalCol; ++col) {
            if (row != 1 && row != 2 * i - 1 && col != 0 && col != totalCol - 1) {
               System.out.print("  ");
            } else {
               System.out.print("* ");
            }
         }

         System.out.println();
      }

   }
}
