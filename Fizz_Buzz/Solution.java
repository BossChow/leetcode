/**
 * Write a program that outputs the string representation of numbers from 1 to n.
 *
 * But for multiples of three it should output “Fizz” instead of the number and for the multiples of five output “Buzz”.
 * For numbers which are multiples of both three and five output “FizzBuzz”.
 */


public class Solution {
    public static void main(String[] args) {
        String[] result = getFizzBuzz(15);
    }

    private static String[] getFizzBuzz(int num) {
        if (num <= 0) {
            return new String[]{};
        }

        String[] result_list = new String[num];

        for (int i = 0; i < num; i++) {
            int value = i + 1;
            String result = "";

            if (value % 3 == 0 && value % 5 == 0) {
                //
                result = "FizzBuzz";
            } else {
                if (value % 3 == 0) {
                    result = "Fizz";
                } else if (value % 5 == 0) {
                    result = "Buzz";
                } else {
                    result = String.valueOf(value);
                }
            }
            System.out.println(result);
        }

        return result_list;
    }
}
