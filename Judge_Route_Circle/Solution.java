public class Solution {
    public boolean judgeCircle(String moves) {
        int x = 0;
        int y = 0;
        for (char ch : moves.toCharArray()) {
            if ('U' == ch) y++;
            else if ('D' == ch) y--;
            else if ('L' == ch) x--;
            else if ('R' == ch) x++;
        }

        return x == 0 && y == 0;
    }
}
