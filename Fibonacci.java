public class Fibonacci{
    public static int Fib(int n){
        if(n == 0 || n == 1){
            return n;
        }
        int fnm1 = Fib(n - 1);
        int fnm2 = Fib(n - 2);
        int fn = fnm1 + fnm2;
        return fn;
    }

    public static boolean isSorted(int arr[], int i){
        if(i == arr.length - 1){
            return true;
        }
        
        if(arr[i] > arr[i + 1]){
            return false;
        }

        return isSorted(arr, i + 1);
    }

    public static int firstOccourance(int arr[], int key, int i){
        if(i == arr.length){
            return -1;
        }

        if(arr[i] == key){
            return i;
        }

        return firstOccourance(arr, key, i + 1);
    }

    public static int lastOccourance(int arr[], int key, int i){
        if(i == arr.length){
            return -1;
        }
        int isFound = lastOccourance(arr, key, i + 1);
        if(isFound == -1 && arr[i] == key){
            return i;
        }

        return isFound;
    }

    public static int power(int x, int n){
        if(n == 0){
            return 1;
        }
        return x * power(x, n - 1);
    }

    public static int optimizedPower(int x, int n){
        if(n == 0){
            return 1;
        }
        int halfPower = optimizedPower(x, n/2);
        int halfPowerSq = halfPower * halfPower;

        if(n % 2 != 0){
            halfPowerSq = x * halfPowerSq;
        }

        return halfPowerSq;
    }

    public static void main(String args[]){
        // int n = 15;
        // System.out.println(Fib(n));
        // int arr[] = {1, 2, 3, 5, 4};
        // System.out.println(isSorted(arr, 0));
        // int arr[] = {8, 4, 3, 5, 6, 1, 2, 3, 5, 9};
        // System.out.println(firstOccourance(arr, 5, 0));
        // System.out.println(lastOccourance(arr, 5, 0));
        // System.out.println(power(2, 5));
        System.out.println(optimizedPower(2, 10));
    }
}

