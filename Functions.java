public class Functions{

    // public static void printtable(int number){
        // Scanner sc = new Scanner(System.in);
    //     System.out.println("Which table do you want??");
    //     int n = sc.nextInt();
    //     for(int i = 1; i <= 10; i++){
    //         System.out.println(n + " X" + " " + i + " =" + " " + n*i);
    //     }
    // } 
    // public static void main(String args[]){
    //     printtable(5);

    // public static void sum(int a, int b){    // Parameters of Formal Parameters
    //     int Sum = a + b;
    //     System.out.println(a + " " + "+" + " " + b + " " + "=" + " " + Sum);
    // }

    // public static void main(String args[]){
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter the numbers");
    //     int a = sc.nextInt();
    //     int b = sc.nextInt();
    //     sum(a, b);  // Arguements or Actual Parameters

    // public static int Product(int a, int b){
    //     int product = a * b;
    //     System.out.println("Product is " + product);
    //     return product;
    // }

    // public static void main(String args[]){
    //    Product(5, 4);
    // }

    // public static int Factorial(int n){
    //     int fact = 1;
    //     for(int i = 1; i <= n; i++){
    //         fact *= i;
    //     }
    //     return fact;
    // }

    // public static void main(String args[]){
    //     int a = Factorial(5);
    //     int b = Factorial(2);
    //     int c = Factorial(5-2);
    //     int binocoeff = a / (b * c);
    //     System.out.println(binocoeff);
    // }

    // Function Overloading - Keeping the name of the function same but changing the parameters. Ex - calculator
    // Two types - 1. Using Parameters
                // 2. Using Data Types

    // public static boolean isPrime(int n){
    //     boolean isPrime = true;
    //     for(int i = 2; i <= n-1; i++){
    //         if(n % i == 0){
    //             isPrime = false;
    //         }
    //     }
    //     return isPrime;
    // }             
    // public static void main(String args[]){
    //     System.out.println(isPrime(5));
    // }

    // public static boolean isPrime(int n){
    //     boolean isPrime = true;
    //     for(int i = 1; i <= Math.sqrt(n); i++){
    //         if(n % i == 0){
    //             isPrime = false;
    //         }
    //     }
    //     return isPrime;
    // }

    // public static void printPrime(int n){
    //     for(int i = 2; i <= n; i++){
    //         if(isPrime(i)){
    //             System.out.print(i + " ");
    //         }
    //     }
    // }

    // public static void main(String args[]){
    //     System.out.println(printPrime(10));
    // }

    // public static void BinToDec(int Binnum){
    //     int pow = 0;
    //     int Decnum = 0;
    //     while(Binnum > 0){
    //         int lastdigit = Binnum % 10;
    //         Decnum = Decnum + (lastdigit * (int)Math.pow(2,pow));
    //         pow++;
    //         Binnum = Binnum/10;
    //     }
    //     System.out.println("The Decimal is " + Decnum);
    // }
    // public static void main(String args[]){
    //     BinToDec(1000);
    // }

    public static void decToBin(int decNum){
        int num = decNum;
        int pow = 0;
        int Binnum = 0;
        while(decNum > 0){
            int rem = decNum % 2;
            Binnum = Binnum + (rem * (int)Math.pow(10,pow));
            pow++;
            decNum = decNum / 2;
        }
        System.out.println("The Binary of " + num + " is " + Binnum);
    }

    public static void main(String args[]){
        decToBin(5);
    }
    }