package untitled;

public class pattern20 {
   public pattern20() {
   }

   public static void main(String[] args) {
      pattern(5);
   }

   private static void pattern(int i) {
      int a = 1;

      for(int row = 0; row <= i; ++row) {
         for(int col = 0; col < row; ++col) {
            int var10001 = a++;
            System.out.print("" + var10001 + " ");
         }

         System.out.println();
      }

   }
}
