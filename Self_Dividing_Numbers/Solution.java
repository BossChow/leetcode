import java.util.List;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        List<Integer> result = selfDividingNumbers(1, 22);
        System.out.println(result);
    }

    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<>();
        for (int i = left; i<= right; i++) {
            int j = i;
            for (; j > 0; j /= 10) {
                if ((j % 10 == 0) || i % (j % 10) != 0) break;
            }
            if (j == 0) {
                result.add(i);
            }
        }

        return result;
    }
}
