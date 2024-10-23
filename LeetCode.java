import java.util.*;

public class LeetCode {
    public static void TwoSum(int[] num, int t) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < num.length; i++) {
            int comp = t - num[i];
            if (map.containsKey(comp)) {
                System.out.println(map.get(comp) + "," + i);
                System.out.println(comp + "," + num[i]);
                return;
            }
            map.put(num[i], i);
        }
        System.out.println("not two sum solution");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 2, 7, 11, 15 };
        int t = sc.nextInt();
        TwoSum(arr, t);
    }
}