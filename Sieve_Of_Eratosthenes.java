import java.util.*;
import java.util.Arrays;
public class Sieve_Of_Eratosthenes{
    public static ArrayList<Integer> sieveOfEratosthenes(int n) {
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);

        for(int i = 2; i * i <= n; i++) {
            if(isPrime[i]) {
                for(int j = 2; i * j <= n; j++) {
                    isPrime[i * j] = false;
                }
            }
        }

        ArrayList<Integer> result = new ArrayList<>();
        for(int i = 2; i <= n; i++) {
            if(isPrime[i]) {
                result.add(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int n = 30;
        ArrayList<Integer> primes = sieveOfEratosthenes(n);
        System.out.println(primes);
    }
}