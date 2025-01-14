import java.util.*;
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

    public static int[] findThePrefixCommonArrayUsingHashSet(int[] A, int[] B){ // HashSet Approach O(n^2)
        int n = A.length;
        int[] C = new int[n];

        Set<Integer> elementsInA = new HashSet<>();
        Set<Integer> elementsInB = new HashSet<>();

        for(int i = 0; i < n; i++){
            elementsInA.add(A[i]);
            elementsInB.add(B[i]);

            int commonIndex = 0;

            for(int element : elementsInA){
                if(elementsInB.contains(element)){
                    commonIndex++;
                }
            }
            C[i] = commonIndex;
        }
        return C;
    }

    public static int[] findThePrefixCommonArrayUsingFrequencyArray(int[] A, int[] B){
        int n = A.length;
        int[] C = new int[n];
        int[] frequency = new int[n + 1];
        int commonIndex = 0;

        for(int currentIndex = 0; currentIndex < n; currentIndex++){
            frequency[A[currentIndex]] += 1;
            if(frequency[A[currentIndex]] == 2) commonIndex++;

            frequency[B[currentIndex]] += 1;
            if(frequency[B[currentIndex]] == 2) commonIndex++;

            C[currentIndex] = commonIndex;
        }

        return C;
    }

    public static void main(String[] args) {
        int[] A = {1, 3, 2, 4};
        int[] B = {3, 1, 2, 4};
        int[] result = findThePrefixCommonArrayUsingFrequencyArray(A, B);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}
