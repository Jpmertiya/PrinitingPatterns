package untitled;

public class pattern11 {
   public pattern11() {
   }

   public static void main(String[] args) {
      attern(8);
   }

   private static void attern(int i) {
      for(int row = 0; row < i; ++row) {
         int col;
         for(col = i; col > row; --col) {
            System.out.print(" ");
         }

         for(col = 0; col < row; ++col) {
            if (row != 1 && row != i - 1 && col != 0 && col != row - 1) {
               System.out.print("  ");
            } else {
               System.out.print("* ");
            }
         }

         System.out.println();
      }

   }
}
