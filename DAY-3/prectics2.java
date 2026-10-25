import java.util.*;
public class prectics2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    List<Integer> nums = Arrays.asList(2, 4, 3, 5, 6);
    // int sum = 0;
    // for (int n : nums) {
    //   if (n % 2 == 0) {
    //     n = n * 2;
    //     sum = sum + n;
    //   }
    // }
    // System.out.println(sum);
    // for (int i = 0; i < nums.size(); i++) {
    //   System.out.println(nums.get(i));
    // }

    nums.forEach(n->System.out.println(n));
  }
}
