public class Pattern9 {
    public static void main(String[] args) {
        int n=5;
        for (int row=n+2;row>=1;row--) {
            int spaces=n-row+2;
            for (int s=0;s<spaces;s++){
                System.out.print(" ");
            }
            for (int col = n; col <= ((2*row)-1); col++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
/*
         *********
          *******
           *****
            ***
             *
 */