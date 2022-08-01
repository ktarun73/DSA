public class Pattern15 {
    public static void main(String[] args) {
        int n=5;
        for (int row=1;row<2*n;row++){
            int noOfColsInRow=row>n ? ((n-(row-n))*2)-1 : (2*row)-1 ;
            int space=row>n ? row-n : n-row;
            for (int s=space;s>=0;s--){
                System.out.print(" ");
            }
            for(int col=1;col<=noOfColsInRow;col++){
                if(col==1 || col==(2*row)-1 || col==((n-(row-n))*2)-1){
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
    *       *
     *     *
      *   *
       * *
        *

 */
