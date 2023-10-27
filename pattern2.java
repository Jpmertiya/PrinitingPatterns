package untitled;
public class pattern2 {
   public pattern2() {
   }

   public static void main(String[] args) {
      pattern(5);
   }

   private static void pattern(int i) {
      for(int row = 0; row < i; ++row) {
         for(int col = 0; col < i; ++col) {
            System.out.print("* ");
         }

         System.out.println();
      }

   }
}