package untitled;

public class pattern22 {
   public pattern22() {
   }

   public static void main(String[] args) {
      pattern(3);
   }

   private static void pattern(int i) {
      int len = 2 * i;

      for(int row = 0; row <= len; ++row) {
         for(int j = 0; j <= len; ++j) {
            int num = Math.min(Math.min(row, j), Math.min(len - row, len - j));
            System.out.print("" + num + " ");
         }

         System.out.println();
      }

   }
}
