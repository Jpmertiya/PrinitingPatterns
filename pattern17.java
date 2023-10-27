package untitled;

public class pattern17 {
   public pattern17() {
   }

   public static void main(String[] args) {
      pattern(5);
   }

   private static void pattern(int i) {
      for(int row = 0; row <= 2 * i; ++row) {
         int totalSpace = row > i ? i - (row - i) : row;

         int totalCol;
         for(totalCol = i; totalCol >= totalSpace; --totalCol) {
            System.out.print("*");
         }

         totalCol = row > i ? 2 * i - row : row;

         int space;
         for(space = 0; space < totalCol; ++space) {
            System.out.print("  ");
         }

         for(space = i; space >= totalSpace; --space) {
            System.out.print("*");
         }

         System.out.println();
      }

   }
}
