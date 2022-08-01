import java.util.ArrayList;
import java.util.List;

public class Pattern16 {
    public static void main(String[] args) {
        int n = 5;
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> cur, prev=new ArrayList<>();
        for (int i=0;i<n;i++) {
            cur=new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(i==j || i==0 || j==0) cur.add(1);
                else cur.add(prev.get(j-1)+prev.get(j));
            }
            prev=cur;
            res.add(cur);
        }


        for(List<Integer> lis:res){
            for(int i=0;i<n-lis.size();i++){
                System.out.print(" ");
            }
            for(int i:lis){
                System.out.print(i+" ");
            }
            System.out.println();
        }

    }
}

/*

              1
            1   1
          1   2   1
        1   3   3   1
      1   4   6   4   1

 */
