// import java.util.*;
// public class Strings{

//     public static void printletters(String str){
//         for(int i = 0; i < str.length(); i++){
//             System.out.print(str.charAt(i) + " ");
//         }
//         System.out.println();
//     }

//     public static boolean isPalindrome(String str){
//         for(int i = 0; i < str.length()/2; i++){
//             int n = str.length();
//             if(str.charAt(i) != str.charAt(n - 1 - i)){
//                 return false;
//             }
//         }
//         return true;
//     }

//     public static float getShortestpth(String path){
//         int x = 0, y = 0; 
//         for(int i = 0; i < path.length(); i++){
//             char dir = path.charAt(i);
//             if(dir == 'N'){
//                 y++;
//             } else if(dir == 'S'){
//                 y--;
//             } else if(dir == 'E'){
//                 x++;
//             } else {
//                 x--;
//             }
//         }
//             int X2 = x * x;
//             int Y2 = y * y;
//             return (float)Math.sqrt(X2 + Y2);
//     }

//     public static String toUpperCase(String str){
//         StringBuilder sb = new StringBuilder("");

//         char ch =  Character.toUpperCase(str.charAt(0));
//         sb.append(ch);

//         for(int i = 1; i < str.length(); i++){
//             if(str.charAt(i) == ' ' && i < str.length() - 1){
//                 sb.append(str.charAt(i));
//                 i++;
//                 sb.append(Character.toUpperCase(str.charAt(i)));
//             } else {
//                 sb.append(str.charAt(i));
//             }
//         }
//         return sb.toString();
//     }

//     public static String compress(String str){
//         StringBuilder sb = new StringBuilder("");

//         for(int i = 0; i < str.length(); i++){
//             Integer count = 1;
//             while(i < str.length() - 1 && str.charAt(i) == str.charAt(i+1)){
//                 count++;
//                 i++;
//             }
//             sb.append(str.charAt(i));
//             if(count > 1){
//                 sb.append(count.toString());
//             }
//         }
//         return sb.toString();
//     }


//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         // String name = sc.nextLine();
//         // System.out.println(name);
//         // System.out.println(name.length());

//         String firstname = "Ayush";
//         String lastname = "Sahu";
//         String fullname = firstname + " " + lastname;
//         // System.out.println(fullname);
//         // printletters(fullname);
//         // String str = "nitin";
//         // System.out.println(str.substring(0,5));
//         // System.out.println(isPalindrome(str));
//         String path = "WNEENESENNN";
//         // System.out.println(getShortestpth(path));

//         String fruits[] = {"apple", "mango", "banana"};
//         String largest = fruits[0];
//         for(int i = 0; i < fruits.length; i++){
//             if(largest.compareTo(fruits[i]) < 0){
//                 largest = fruits[i];
//             }
//         }
//         // System.out.println(largest);

//         // String str = "hi, i am ayush";
//         // System.out.println(toUpperCase(str));
//         String str = "aaabbccddd";
//         System.out.println(compress(str));
//     }
// }