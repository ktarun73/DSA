import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Leetcode315 {


    public static void main(String[] args) {
        int[] ar={5,2,6,1};

        List<Integer> ans=countSmaller(ar);
        System.out.print("[ ");
        for (int i:ans) {
            System.out.print(i+" ");
        }
        System.out.println("] ");

    }


    public static List<Integer> countSmaller(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        List<Integer> li = new ArrayList<>();
        for (int i = nums.length - 1; i >= 0; i--) {
            int index = binarySearch(li, nums[i]);
            li.add(index, nums[i]);
            //System.out.println(index+" "+li+" "+nums[i]);
            ans.add(index);
        }
        Collections.reverse(ans);
        return ans;
    }

    public static int binarySearch(List<Integer> li, int element) {
        int low = 0;
        int high = li.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (mid == 0) {
                if (li.get(mid) >= element)
                    return 0;
                else if (li.get(high) < element)
                    return high + 1;
                else
                    return 1;
            }
            if (li.get(mid) >= element && li.get(mid - 1) < element) {
                return mid;
            } else if (li.get(mid) >= element && li.get(mid - 1) >= element) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return li.size();
    }
}