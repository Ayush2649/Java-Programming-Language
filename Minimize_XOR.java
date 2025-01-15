public class Minimize_XOR {
    public static int minimizeXOR(int num1, int num2){
        int count = Integer.bitCount(num2);
        int result = 0;

        for(int i = 31; i >= 0 && count > 0; i--){
            if((num1 & (1 << i)) != 0){
                count--;
                result += (1 << i);
            }
        }

        for(int i = 0; i < 32 && count > 0; i++){
            if((num1 & (1 << i)) == 0){
                count--;
                result += (1 << i);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(minimizeXOR(21, 30));
    }
}
