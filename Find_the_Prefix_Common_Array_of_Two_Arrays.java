public class Find_the_Prefix_Common_Array_of_Two_Arrays {
    public static int[] findThePrefixCommonArrayBruteForce(int[] A, int[] B){ // Brute Force O(n^3)
        int n = A.length;
        int[] C = new int[n];

        for(int i = 0; i < n; ++i){
            int commonCount = 0;

            for(int aIndex = 0; aIndex <= i; ++aIndex){
                for(int bIndex = 0; bIndex <= i; ++bIndex){
                    if(A[aIndex] == B[bIndex]) {
                        commonCount++;
                        break;
                    }
                }
            }
            C[i] = commonCount;
        }
        return C;
    }

    public static void main(String[] args) {
        int[] A = {1, 3, 2, 4};
        int[] B = {3, 1, 2, 4};
        // int[] result = findThePrefixCommonArray(A, B);
        // for (int i : result) {
        //     System.out.print(i + " ");
        // }
    }
}
