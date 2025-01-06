import java.util.Arrays;
public class Minimum_Number_of_Operations_to_Move_All_Balls_to_Each_Box {
    public static int[] minOperations(String boxes){
        int n = boxes.length();
        int[] answer = new int[n];

        int cumValue = 0;
        int cumSumValue = 0;

        for(int i = 0; i < n; i++){
            answer[i] = cumSumValue;

            cumValue += boxes.charAt(i) == '0' ? 0 : 1;
            cumSumValue += cumValue;
        }

        cumSumValue = 0;
        cumValue = 0;

        for(int i = n - 1; i >= 0; i--){
            answer[i] += cumSumValue;

            cumValue += boxes.charAt(i) == '0' ? 0 : 1;
            cumSumValue += cumValue;
        }
        return answer;
    }

    public static void main(String[] args) {
        String boxes = "110";
        int[] result = minOperations(boxes);
        System.out.println(Arrays.toString(result));
    }
}
