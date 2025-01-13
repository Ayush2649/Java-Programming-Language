import java.util.*;
public class Minimum_Length_of_String_After_Operations {
    public static int minimumLengthUsingMap(String s){
        HashMap<Character, Integer> charFrequencyMap = new HashMap<>();
        for(char currChar : s.toCharArray()){
            charFrequencyMap.put(currChar, charFrequencyMap.getOrDefault(currChar, 0) + 1);
        }

        int deleteCount = 0;
        for(int frequency : charFrequencyMap.values()){
            if(frequency % 2 == 1){
                deleteCount += frequency - 1;
            } else {
                deleteCount += frequency - 2;
            }
        }

        return s.length() - deleteCount;
    }

    public static int minimumLengthUsingFrequencyArray(String s){
        int[] frequencyArray = new int[26];
        int totalLength = 0;

        for(char currChar : s.toCharArray()){
            frequencyArray[currChar - 'a']++;
        }

        for(int frequency : frequencyArray){
            if(frequency == 0) continue;
            if(frequency % 2 == 1){
                totalLength += 1;
            } else {
                totalLength += 2;
            }
        }

        return totalLength;
    }

    public static void main(String[] args) {
        String s = "abaacbcbb";
        System.out.println(minimumLengthUsingFrequencyArray(s));
    }
}
