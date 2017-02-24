public class Solution {

    public static void main(String[] args) {
        String testStr = "89";
        boolean result = isStrobogrammaticNum(testStr);
        System.out.println(result);
    }

    /**
     * 判断输入是否为Strobogrammatic Number
     */
    private static boolean isStrobogrammaticNum(String input) {
        char[] charSeq = input.toCharArray();
        int i = 0;
        int j = charSeq.length - 1;

        for (; i < j ;) {
            if (charSeq[i] == charSeq[j]) {
                if (charSeq[i] != '1' && charSeq[i] != '0' && charSeq[i] != '8') {
                    return false;
                }

            } else {
                if ((charSeq[i] != '6' || charSeq[j] != '9') && (charSeq[i] != '9' || charSeq[j] != '6')){
                    return false;
                }
            }
            i++;
            j--;
        }

        return true;
    }
}
