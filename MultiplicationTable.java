import java.util.*;
public class MultiplicationTable{
    public static void printMultiplicationTable(int number){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number : ");
    int n = sc.nextInt();
      for(int i = 1; i <= 10; i++){
          System.out.println(n + " X " + i + " = " + n*i);
      }
      sc.close();
    }
    public static void main(String args[]){
      printMultiplicationTable(5);
    }
}