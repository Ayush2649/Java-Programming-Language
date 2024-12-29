// public class Recursion{
//     public static void printDec(int n){
//         if(n == 1){
//             System.out.print(n);
//             return;
//         }
//         System.out.print(n + " ");
//         printDec(n - 1);
//     }

//     public static void printInc(int n){
//         if(n == 1){
//             System.out.println();
//             System.out.print(n + " ");
//             return;
//         }
//         printInc(n - 1);
//         System.out.print(n + " ");
//     }

//     public static int fact(int n){
//         if(n == 0){
//             return 1;
//         }
//         int fnm1 = fact(n - 1);
//         int fn = n * fact(n - 1);
//         return fn;
//     }

//     public static int calcSum(int n){
//         if(n == 1){
//             return 1;
//         }
//         int snm1 = calcSum(n - 1);
//         int sn = n + snm1;
//         return sn;
//     }

//     public static void main(String args[]){
//         // printDec(10);
//         // printInc(10);
//         // System.out.println(fact(5));
//         System.out.println(calcSum(10));
//     }
// }