public class Pattern13 {
    public static void main(String[] args) {
        int n=5;
        for (int row=1;row<=n;row++) {
            for (int space = n-row; space>=0 ; space--) {
                System.out.print(" ");
            }
            for (int col = 1; col <=((2*row)-1) ; col++) {
                if(row==n || col==1 || col==((2*row)-1)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}

/*
         *
        * *
       *   *
      *     *
     *********

 */
