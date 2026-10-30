
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Collection1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    List<Integer> nums = new ArrayList<>();
    nums.add(10);
    nums.add(20);
    nums.add(30);
    nums.add(40);
    // System.out.println(nums);
    System.out.println(nums.get(3));
    for (int ele : nums) {
      System.out.println(ele+" ");
    }
  }
}
