import java.util.ArrayList;
import java.util.Stack;

public class SumOfSubarray {
    static ArrayList<ArrayList<Integer>> res = new ArrayList<>();
    public static void main(String[] args) {
        int[] arr = {2, 5, 6, 7, 3, 1, 4};
        int target = 7;
        sumOfSubArray(arr, target, 0, new Stack<>());
        System.out.println(res);
    }
    
    public static void sumOfSubArray(int[] arr, int target, int index, Stack<Integer> ds) {
        if(target == 0) {
            ArrayList<Integer> ans = new ArrayList<>(ds);
            res.add(ans);
            return;
        }

        if(index == arr.length || target < 0) {
            return;
        }
        ds.add(arr[index]);
        sumOfSubArray(arr, (target - arr[index]), index, ds);
        ds.pop();
        sumOfSubArray(arr, target, index + 1, ds);
    }
}
