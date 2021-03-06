public class Main {
    public static void main(String[] args) {
//        pattern1(4);
//        pattern4(5);
//        pattern28(5);
//        pattern30(5);
        pattern17(4);
    }
    static void pattern1(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = n; j>=i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern4(int n){
        for (int i = 1; i<=n;i++) {
            for (int j=1;j<=i;j++) {
                System.out.printf(j+" ");
            }
            System.out.println();

        }
    }

    static void pattern5(int n){
        for(int row=1;row<2*n;row++){
//            System.out.print(row);
            if(row>n){
                int c=n-(row-n);
//                System.out.print(c);
                for (int cols = c; cols>=1; cols--) {
                    System.out.print("* ");
                }
                System.out.println();
            }
            else{
//                System.out.print(row);
                for (int cols = 1; cols <=row ; cols++) {
                    System.out.print(("* "));
                }
                System.out.println();
            }
        }

    }
    static void pattern5_2(int n){
        for (int row = 0; row < 2*n; row++) {
            int totalColsInRow=row>n ? 2*n-row-1 : row;
            for (int cols = 0; cols < totalColsInRow; cols++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern28(int n){
        for (int row = 0; row < 2*n; row++) {
            int totalColsInRow=row>n ? 2*n-row : row;
            int noOfSpaces=n-totalColsInRow;
            for (int s=0;s<noOfSpaces;s++){
                System.out.print(" ");
            }
            for (int cols = 0; cols < totalColsInRow; cols++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern30(int n){
        for (int row = 1; row<=n;row++) {
            for (int space=0;space<=n-row;space++) {
                System.out.print("  ");
            }

            for(int col=row;col>=1;col--){
                System.out.print(col+" ");
            }
            for(int col=2;col<=row;col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }

    static void pattern17(int n){
        for (int row = 1; row<=2*n;row++) {

            int noOfColsInRow=row>n ? 2*n-row : row;

            int noOfSpaces=n-noOfColsInRow;
            for (int space=0;space<=noOfSpaces;space++) {
                System.out.print("  ");
            }

            for(int col=noOfColsInRow;col>=1;col--){
                System.out.print(col+" ");
            }
            for(int col=2;col<=noOfColsInRow;col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
}
