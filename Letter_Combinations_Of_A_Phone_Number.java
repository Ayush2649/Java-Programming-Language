import java.util.*;
public class Letter_Combinations_Of_A_Phone_Number{
    public static ArrayList<String> letterCombinaations(String digits){
        if(digits.isEmpty()) return new ArrayList<>();

        String[] phone_map = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        ArrayList<String> result = new ArrayList<>();
        backtracking("", digits, phone_map, result);
        return result;
    }

    public static void backtracking(String combination, String next_digits, String[] phone_map, List<String> result){
        if(next_digits.isEmpty()){
            result.add(combination);
            return;
        }

        // String letters = phone_map[next_digits.charAt(0) - '2'];
        String letters = phone_map[next_digits.charAt(0) - '2'];
        for(char letter : letters.toCharArray()){
            backtracking(combination + letter, next_digits.substring(1), phone_map, result);
        }
    }

    public static void main(String[] args){
        String digits = "23";
        System.out.println(letterCombinaations(digits));
    }
}