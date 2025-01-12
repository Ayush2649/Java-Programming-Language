public class Check_if_a_Parentheses_String_Can_Be_Valid {
    public static boolean canBeValid(String s, String locked){
        int n = s.length();

        if(n % 2 == 1){
            return false;
        }

        int balanced = 0;
        int freeSlots = 0;

        for(int i = 0 ; i < n; i++){
            if(locked.charAt(i) == '0'){
                freeSlots++;
            } else if (s.charAt(i) == '('){
                balanced++;
            } else {
                balanced--;
            }

            if(balanced + freeSlots < 0){
                return false;
            }
        }

        balanced = 0;
        freeSlots = 0;

        for(int i = n - 1; i >= 0; i--){
            if(locked.charAt(i) == '0'){
                freeSlots++;
            } else if (s.charAt(i) == ')'){
                balanced++;
            } else {
                balanced--;
            }

            if(balanced + freeSlots < 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "))()))";
        String locked = "010100";
        System.out.println(canBeValid(s, locked));
    }
}
