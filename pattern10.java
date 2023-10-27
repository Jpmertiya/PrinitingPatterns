package untitled;

public class pattern10 {
   public pattern10() {
   }

   public static void main(String[] args) {
      patern(5);
   }

   private static void patern(int i) {
      for(int row = 0; row <= 2 * i; ++row) {
         int totalSpace = row > i ? 2 * i - row : row;

         int totalCol;
         for(totalCol = 0; totalCol < totalSpace; ++totalCol) {
            System.out.print(" ");
         }

         totalCol = row >= i ? i - (row - i) : row;

         for(int col = i; col >= totalCol; --col) {
            System.out.print("* ");
         }

         System.out.println();
      }

   }
}
