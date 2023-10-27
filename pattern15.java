package untitled;

public class pattern15 {
   public pattern15() {
   }

   public static void main(String[] args) {
      pattern(5);
   }

   private static void pattern(int i) {
      for(int row = 0; row <= i; ++row) {
         int col;
         for(col = i; col > row; --col) {
            System.out.print(" ");
         }

         for(col = 0; col <= row; ++col) {
            if (row != 1 && col != 0 && col != row) {
               System.out.print("" + row + " ");
            } else {
               System.out.print("1 ");
            }
         }

         System.out.println();
      }

   }
}
