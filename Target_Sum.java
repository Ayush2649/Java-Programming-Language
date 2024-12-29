import java.util.Arrays;
public class Target_Sum {
    public static int S;

    public static int solve(int[] nums, int target, int i, int sum, int[][] t){
        if(i == nums.length){
            return sum == target ? 1 : 0;
        }

        if(t[i][sum + S] != Integer.MIN_VALUE){
            return t[i][sum + S];
        }

        int plus = solve(nums, target, i + 1, sum + nums[i], t);
        int minus = solve(nums, target, i + 1, sum - nums[i], t);

        return t[i][sum + S] = plus + minus;
    }

    public static int findTargetSumWays(int[] nums, int target){
        int n = nums.length;
        S = Arrays.stream(nums).sum();
        int[][] t = new int[n][2 * S + 1];

        for(int[] row : t){
            Arrays.fill(row, Integer.MIN_VALUE);
        }

        return solve(nums, target, 0, 0, t);
    }

    public static void main(String[] args){
        int[] nums = {1, 1, 1, 1, 1};
        int target = 3;
        System.out.println(findTargetSumWays(nums, target));
    }
}