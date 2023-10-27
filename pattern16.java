package untitled;

public class pattern16 {
   public pattern16() {
   }

   public static void main(String[] args) {
      pattern(8);
   }

   private static void pattern(int i) {
      for(int row = 0; row < 2 * i; ++row) {
         int col;
         if (row <= i / 2) {
            for(col = i / 2; col >= row; --col) {
               System.out.print(" ");
            }

            for(col = row; col >= 0; --col) {
               System.out.print(col + 1);
            }

            for(col = 1; col <= row; ++col) {
               System.out.print(col + 1);
            }

            System.out.println();
         } else {
            for(col = i; col >= i - (2 * row - i); col -= 2) {
               System.out.print(" ");
            }

            for(col = i - row; col >= 0; --col) {
               System.out.print(col + 1);
            }

            for(col = 1; col <= i - row; ++col) {
               System.out.print(col + 1);
            }

            System.out.println();
         }
      }

   }
}