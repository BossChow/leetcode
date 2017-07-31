import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int inputValue  = scanner.nextInt();
        int result = reverseint(inputValue);
        System.out.println("Reverse Value: " + result);

        System.out.println(97396299 > Integer.MAX_VALUE);

    }

    public static int reverseint(int x) {

        long result = 0;
        while (x != 0) {
            int i = x % 10;
            System.out.println(i);
            x /= 10;
            result += i;
            result *= 10;
        }

        result /= 10;

        if (result < Integer.MIN_VALUE || result > Integer.MAX_VALUE) {
            result = 0;
        }

        return (int)result;
    }
}
