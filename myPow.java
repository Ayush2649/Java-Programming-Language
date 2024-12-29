public class myPow {
    public static double Pow(double x, int n){
        long binForm  = n;
        if(n < 0){
            x = 1/x;
            binForm = -binForm;
        }
        double ans = 1;

        while(binForm > 0){
            if(binForm %2 == 1){
                ans *= x;
            }
            x *= x;
            binForm /= 2;
        }
        return ans;
    }

    public static void main(String args[]){
        double base = 3.0;
        long exponent = 5;

        double result = Pow(base, (int) exponent);
        System.out.println(base + " ^ " + exponent + " = " + result);
    }
}
