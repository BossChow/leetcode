class Solution {
    public int[] anagramMappings(int[] A, int[] B) {
       Map<Integer, Integer> mapping = new HashMap<>();
        for (int i = 0; i < B.length; i++) {
            mapping.put(B[i], i);
        }

        int[] result = new int[A.length];
        for (int j = 0; j < A.length; j++) {
            result[j] = mapping.get(A[j]);
        }

        return result;
    }
}
