package untitled;

public class pattern5 {
   public pattern5() {
   }

   public static void main(String[] args) {
      pattern(5);
      pattern2(5);
      pattern3(5);
   }

   private static void pattern(int i) {
      int row;
      int col;
      for(row = 0; row < i; ++row) {
         for(col = 0; col < row; ++col) {
            System.out.print("* ");
         }

         System.out.println();
      }

      for(row = 0; row < i; ++row) {
         for(col = i; col > row; --col) {
            System.out.print("* ");
         }

         System.out.println();
      }

   }

   private static void pattern2(int i) {
      for(int row = 0; row < 2 * i; ++row) {
         int col;
         if (row <= i) {
            for(col = 0; col < row; ++col) {
               System.out.print("* ");
            }
         } else {
            for(col = row - i; col < i; ++col) {
               System.out.print("* ");
            }
         }

         System.out.println();
      }

   }

   private static void pattern3(int i) {
      for(int row = 0; row < 2 * i; ++row) {
         int totalCol = row > i ? 2 * i - row : row;

         for(int col = 0; col < totalCol; ++col) {
            System.out.print("* ");
         }

         System.out.println();
      }

   }
}