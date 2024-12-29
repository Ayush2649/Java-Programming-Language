public class Construct_String_With_Repeat_Limit {
    public static String repeatLimitedString(String s, int repeatLimit) {
        int[] count = new int[26];

        for(char ch : s.toCharArray()){
            count[ch - 'a']++;
        }

        StringBuilder result = new StringBuilder();
        int i = 25;

        while(i >= 0){
            if(count[i] == 0){
                i--;
                continue;
            }

            char ch = (char) (i + 'a');
            int freq = Math.min(count[i], repeatLimit);

            for(int k = 0; k < freq; k++){
                result.append(ch);
            }
            count[i] -= freq;

            if(count[i] > 0){
                int j = i - 1;
                while(j >= 0 && count[j] == 0){
                    j--;
                }

                if(j < 0){
                    break;
                }

                result.append((char) ('a' + j));
                count[j]--;
            }
        }
        return result.toString();
    }   

    public static void main(String[] args){
        String s = "cczazcc";
        int repeatLimit = 3;
        System.out.println(repeatLimitedString(s, repeatLimit));
    }
}
