public class JavaBasics{
    public static void main(String args[]){
        // System.out.print("Hello World\n");
        // System.out.print("Hello World\n");
        // System.out.print("Hello World\n");
        // System.out.println("****");
        // System.out.println("***");
        // System.out.println("**");
        // System.out.println("*");
        // int a = 10;
        // int b = 20;
        // String name = "Ayush Sahu";
        // System.out.println(a);
        // System.out.println(b);
        // System.out.println(name);

        // a = b;
        // System.out.println(a);

        // byte b = 9; 1 byte [-128 to 127]
        // short s = 240; 2 byte
        // char c = 'a'; 2 byte
        // boolean v = true; 1 byte
        // int i = 1; 4 byte
        // long l = 12345; 8 byte
        // float price = 10.5f; 4 byte 
        // double d = 999.9987654567; 8 byte
        // System.out.println(b);
        // System.out.println(s);
        // System.out.println(c);
        // System.out.println(v);
        // System.out.println(i);
        // System.out.println(l);
        // System.out.println(price);
        // System.out.println(d);

        // int a = 20;
        // int b = 30;
        // int sum = a + b;
        // System.out.println(sum);
        
        // String input = sc.next();
        // System.out.println(input);
        // String name = sc.nextLine();
        // System.out.println(name);
        // int input = sc.nextInt();
        // System.out.println(input);
        // float input = sc.nextFloat();
        // System.out.println(input);

    // int a = sc.nextInt();
    // int b = sc.nextInt();
    // int sum = a + b;
    // System.out.println(sum);

    //     int a = sc.nextInt();
    //     int b = sc.nextInt();
    //     int product = a * b;
    //     System.out.println(product);

    //    float r = sc.nextFloat();
    //    float Area = 3.14f * r * r;
    //    System.out.println(Area);

    // Type Casting  -  byte -> short -> int -> float -> long -> double


    // float a = 27.657f;
    // int b = (int) a;
    // System.out.println(b);

    //Practice Questions
    
    //Q1
    //Scanner sc = new Scanner(System.in);
    // int a = sc.nextInt();
    // int b = sc.nextInt();
    // int c = sc.nextInt();
    // float Avg = (a + b + c)/3;
    // System.out.println(Avg);

    //Q2
    // Scanner sc = new Scanner(System.in);
    // int side = sc.nextInt();
    // int area = side * side;
    // System.out.println(area);

    //Q3
    // Scanner sc = new Scanner(System.in);
    // float pencil = sc.nextFloat();
    // float pen = sc.nextFloat();
    // float eraser = sc.nextFloat();
    // float output = pencil + pen + eraser;
    // System.out.println(output);
    // float gst = (output/10) * 1.8f;
    // float total = output + gst;
    // System.out.println(total);

    //Q4
    // The type of result in the given code will be double as it is the largest data type given

    // int a = 10;
    // int b = 5;
    // int sum = a + b;
    // int diff = a - b;
    // int mult = a * b;
    // int div = a / b;
    // int modulo = a % b;
    // System.out.println(sum);
    // System.out.println(diff);
    // System.out.println(mult);
    // System.out.println(div);
    // System.out.println(modulo);

    // int a = 10;
    // int b = a++;
    // System.out.println(a); 
    // System.out.println(b);

// int a = 10;
// int b = 0;
// b= --a/++a + a + a/--a;
// System.out.println(b);

    // Scanner sc = new Scanner(System.in);
    // int age = sc.nextInt();
    // if(age > 18){
    //     System.out.println("You are an adult");
    // } else {
    //     System.out.println("You are not an adult");
    // }

    // Scanner sc = new Scanner(System.in);
    // int a = sc.nextInt();
    // int b = sc.nextInt();
    // if(a > b){
    //     System.out.println("First Value is larger");
    // } else if(a == b){
    //     System.out.println("Both the values are equal");
    // } else {
    //     System.out.println("Second Value is larger");
    // }

    //  Scanner sc =  new Scanner(System.in);
    //  int num = sc.nextInt();
    //  if(num %2 == 0){
    //      System.out.println("The number is even");
    //  } else {
    //   System.out.println("The number is odd");
    //  }

    // Scanner sc = new Scanner(System.in);
    // System.out.print("Enter your Income : ");
    // float income = sc.nextFloat();
    // float tax;
    // if(income < 500000){
    //     System.out.println("You have to pay no Income Tax");
    // } else if(income >= 500000 && income <= 1000000){
    //     tax = (income * 20f) / 100f;
    //     System.out.println("You hava to pay a tax of " + tax);
    // } else {
    //     tax = (income * 30f) / 100f;
    //     System.out.println("You have to pay a tax of " + tax);
    // }

    // Scanner sc = new Scanner(System.in);
    // System.out.print("Enter the value of a ");
    // int a = sc.nextInt();
    // System.out.print("Enter the value of b ");
    // int b = sc.nextInt();
    // System.out.print("Enter the value of c ");
    // int c = sc.nextInt();
    // if((a > b) && (a > c)){
    //     System.out.println("A is greatest");
    // } else if(b > c){
    //     System.out.println("B is greatest");
    // } else {
    //     System.out.println("C is greatest");
    // }

    // Scanner sc = new Scanner(System.in);
    // System.out.print("Enter a ");
    // int a = sc.nextInt();
    // System.out.print("Enter b ");
    // int b = sc.nextInt();
    // System.out.print("Enter operator ");
    // char operator = sc.next().charAt(0);

    // switch(operator){
    //     case '+' : System.out.println(a + b);
    //     break;
    //     case '-' : System.out.println(a - b);
    //     break;
    //     case '*' : System.out.println(a * b);
    //     break;
    //     case '/' : System.out.println(a / b);
    //     break;
    //     case '%' : System.out.println(a % b);
    //     break;
    //     default : System.out.println("Enter a proper number");
    //     break;
    // }

    // Scanner sc = new Scanner(System.in);
    // int num = sc.nextInt();
    // if(num >= 0){
    //     System.out.println("The number is positive");
    // } else {
    //     System.out.println("The number is negative");
    // }

    // double temp = 103.5;
    // if(temp > 100){
    //     System.out.println("you have fever");
    // } else {
    //     System.out.println("you do not have fever");
    // }

    // Scanner sc = new Scanner(System.in);
    // System.out.println("Enter a number between 1 and 7");
    // int num = sc.nextInt();
    // switch(num){
    //     case 1 : System.out.println("Sunday");
    //     break;
    //     case 2 : System.out.println("Monday");
    //     break;
    //     case 3 : System.out.println("Tuesday");
    //     break;
    //     case 4 : System.out.println("Wednesday");
    //     break;
    //     case 5 : System.out.println("Thursday");
    //     break;
    //     case 6 : System.out.println("Friday");
    //     break;
    //     case 7 : System.out.println("Saturday");
    //     break;
    // }

    // int a = 63, b = 36;
    // boolean x = (a < b) ? true : false;
    // int y = (a > b) ? a : b;
    // System.out.println(x);
    // System.out.println(y);

    // Scanner sc = new Scanner(System.in);
    // System.out.println("Enter the year");
    // int year = sc.nextInt();
    // boolean x = (year % 4) == 0;
    // boolean y = (year % 100) != 0;
    // boolean z = ((year % 100) == 0 && (year % 400) == 0);

    // if(x && (y || z)){
    //     System.out.println(year + " is a leap year");
    // } else {
    //     System.out.println(year + " is not a leap year");
    // }

    // While Loop
    // int i = 1;
    // while(i <= 100){
    //     System.out.println("Hello World!!");
    //     i++;
    // }

    // int i = 1;
    // while(i <= 10){
    //     System.out.println(i);
    //     i++;
    // }

    // Scanner sc = new Scanner(System.in);
    // System.out.print("Enter the value of n : ");
    // int range = sc.nextInt();
    // int i = 1;
    // while(i <= range){
    //     System.out.println(i);
    //     i++;
    // }

    // Scanner sc = new Scanner(System.in);
    // System.out.print("Enter the value of n : ");
    // int n = sc.nextInt();
    // int i = 1;
    // int sum = 0;
    // while(i <= n){
    //    sum = (sum + i);
    //    i++;
    // }
    // System.out.println("Sum = " + sum);


    // for(int i = 1; i <= 10; i++){
    //     System.out.println(i);
    // }

    // for(int i = 1; i <= 4; i++){
    //     System.out.println("****");
    // }

    // int i = 1;
    // while(i <= 4){
    //     System.out.println("****");
    //     i++;
    // }

    // int n = 10899;
    // while(n > 0){
    //     int lastDigit = n % 10;
    //     System.out.print(lastDigit + " ");
    //     n = n / 10; 
    // }
    // System.out.println();

    // Scanner sc = new Scanner(System.in);
    // System.out.println("Enter the number you want to reverse : ");
    // int n = sc.nextInt();
    // while(n > 0){
    //     int lastDigit = n % 10;
    //     System.out.print(lastDigit);
    //     n = n / 10;
    // }
    // System.out.println();

    // Scanner sc = new Scanner(System.in);
    // do{
    //     int n = sc.nextInt();
    //     if(n % 10 == 0){
    //         break;
    //     }
    //     System.out.println(n);
    //     n++;
    // } while(true);

    // Scanner sc = new Scanner(System.in);
    // do{
    //     int n = sc.nextInt();
    //     if(n % 10 == 0){
    //         continue;
    //     }
    //     System.out.println(n);
    //     n++;
    // } while(true);

    // Scanner sc = new Scanner(System.in);
    // System.out.println("Enter the value of n : ");
    // int n = sc.nextInt();

    // boolean isPrime = true;
    // for(int i = 2; i <= n-1; i++){
    //     if(n % i == 0){
    //         isPrime = false;
    //     }
    // }

    // if(isPrime == true){
    //     System.out.println("n is prime");
    // } else {
    //     System.out.println("n is not prime");
    // }

    // Scanner sc = new Scanner(System.in);
    // int number;
    // int choice;
    // int evenSum = 0;
    // int oddSum = 0;

    // do{
    // System.out.print("Enter the number: ");
    // number = sc.nextInt();

    // if(number % 2 == 0){
    //     evenSum += number;
    // } else {
    //     oddSum += number;
    // }
    // System.out.println("Enter 1 if you want to continue the sum or else enter 0");
    // choice = sc.nextInt();
    // } while(choice == 1);

    // System.out.println("Sum of even numbers : " + evenSum);
    // System.out.println("Sum of odd numbers : " + oddSum);

    // int number;
    // int choice;
    // int evenSum=0;
    // int oddSum=0;
    // do{
    //     System.out.print("Enter the number ");
    //     number=sc.nextInt();
    //     if(number%2==0) {
    //         evenSum+=number;
    //         } else{
    //             oddSum+=number;
    //             }
    //         System.out.print("Do you want to continue? Press 1 for yes or 0 for no ");
    //         choice=sc.nextInt();
    //         } while(choice==1);
    //         System.out.println("Sum of even numbers: "+evenSum);
    //         System.out.println("Sum of odd numbers: "+oddSum);

    // Scanner sc = new Scanner(System.in);
    // int num;
    // int fact = 1;
    // System.out.println("Enter the number you want to have factorial: ");
    // num = sc.nextInt();
    // for(int i = 1; i <= num; i++){
    //     fact *= i;
    // }
    // System.out.println("The factorial of " + num + " is " + fact);
    }
}
