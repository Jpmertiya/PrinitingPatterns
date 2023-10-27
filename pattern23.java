package untitled;

public class pattern23 {
   public pattern23() {
   }

   public static void main(String[] args) {
      pattern(4);
   }

   private static void pattern(int i) {
      int max = 2 * i;

      for(int row = 1; row < max; ++row) {
         for(int col = 1; col < max; ++col) {
            int num = i - Math.min(Math.min(row, col), Math.min(max - row, max - col));
            System.out.print("" + num + " ");
         }

         System.out.println();
      }

   }
}
