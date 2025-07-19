public class Count_No_Of_Zeroes {
    public static int count(int n){
        if(n == 0) return 1;
        if(n < 10) return 0;
        if(n % 10 == 0){
            return 1 + count(n / 10);
        } else {
            return count(n / 10);
        }
    }

    public static void main(String[] args) {
        int n = 100200;
        System.out.println("Number of zeroes in " + n + " is: " + count(n));
    }
}