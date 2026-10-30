
import java.util.*;

public class prectics3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    List<Integer> nums = Arrays.asList(2, 3, 4, 5, 6, 7);
    int result=nums.stream()
                   .filter(n->n%2==0)
                   .map(n->n*2)
                   .reduce(0, (c, e) -> c + e);

        System.out.println(result);
  }
}
