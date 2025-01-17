public class Neighbouring_Bitwise_XOR {
    public static boolean doesValidArrayExist(int[] derived){
        int n = derived.length;
        
        int[] original = new int[n];
        original[0] = 0;

        for(int i = 0; i < n - 1; i++){
            original[i + 1] = original[i] ^ derived[i];
        }

        if((original[n - 1] ^ original[0]) == derived[n - 1]){
            return true;
        }

        original[0] = 1;

        for(int i = 0; i < n - 1; i++){
            original[i + 1] = original[i] ^ derived[i];
        }

        if((original[n - 1] ^ original[0]) == derived[n - 1]){
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        int[] derived = {1, 1, 0};
        System.out.println(doesValidArrayExist(derived));
    }
}
