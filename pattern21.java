package untitled;

public class pattern21 {
   public pattern21() {
   }

   public static void main(String[] args) {
      pattern(5);
   }

   private static void pattern(int i) {

      for(int row = 0; row <= i; ++row) {
         for(int col = 0; col <= row; ++col) {
            if ((row + col) % 2 != 1) {
               System.out.print(1);
            } else {
               System.out.print(0);
            }
         }

         System.out.println();
      }

   }
}
