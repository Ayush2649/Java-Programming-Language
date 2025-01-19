import java.util.Arrays;
public class Weekly_Contest {
    static final int MOD = 1_000_000_007;

    public static int minMaxSums(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);

        long powerOfTwo[] = new long[n + 1];
        powerOfTwo[0] = 1; 
        for (int i = 1; i < n; i++) {
            powerOfTwo[i] = (powerOfTwo[i - 1] * 2) % MOD;
        }

        long res = 0;
        
        for (int i = 0; i < n; i++) {
            int maxSize = Math.min(k, i + 1);
            long maxContributions = nums[i] * powerOfTwo[maxSize - 1] % MOD;

            int minSize = Math.min(k, n - i);
            long minContributions = nums[i] * powerOfTwo[minSize- 1] % MOD;

            res = (res + maxContributions - minContributions + MOD) % MOD;
        }

        return (int) res;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3};
        System.out.println(minMaxSums(nums1, 2));
    }
}
