public class Arrays{
    public static int getLargest(int numbers[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i = 0; i < numbers.length; i++){
            if(largest < numbers[i]){
                largest = numbers[i];
            }
            if(smallest > numbers[i]){
                smallest = numbers[i];
            }
        } 
        System.out.println("The smallest number is " + smallest);
        return largest;
    }

    public static int binarySearch(int numbers[], int key){
        int start = 0; 
        int end = numbers.length-1;
        while(start <= end){
            int mid = (start + end) / 2;
            if(numbers[mid] == key){
                return mid;
            }
            if(numbers[mid] < key){
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void reverse(int numbers[]){
        int first = 0; 
        int last = numbers.length - 1;
        while(first < last){
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;

            first++;
            last--;

        }
    }

    public static void printPairs(int numbers[]){
        for(int i = 0; i < numbers.length; i++) {
            int curr = numbers[i];
            for(int j = i + 1; j < numbers.length; j++){
                System.out.print("(" + curr + "," + numbers[j] + ") ");
            }
            System.out.println();
        }
    }

    public static void subArrays(int numbers[]){
        int ts = 0;
        for(int i = 0; i < numbers.length; i++){
            for(int j = i; j < numbers.length; j++){
                for(int k = i; k <= j; k++){
                    System.out.print(numbers[k] + " ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total no of SubArrays are " + ts);
    }

    public static void maxSubArraysSum(int numbers[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i = 0; i < numbers.length; i++){
            for(int j = i; j < numbers.length; j++){
                currSum = 0;
                for(int k = i; k <= j; k++){
                    currSum += numbers[k];
                }
                System.out.println(currSum);
                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Max sum is " + maxSum);
    }

    public static void prefixMaxSubArraysSum(int numbers[]){
        int currSum = 0; 
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];

        prefix[0] = numbers[0];
        for(int i = 1; i < prefix.length; i++){
            prefix[i] = prefix[i-1] + numbers[i];
        }

        for(int i = 0; i < numbers.length; i++){
            for(int j = i; j < numbers.length; j++){
                currSum = i == 0 ? prefix[j] : prefix[j] - prefix[i-1];

                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }
        }
            System.out.println("Max Value is " + maxSum);
    }

    public static void kadanes(int numbers[]){
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for(int i = 0; i < numbers.length; i++){
            currSum = currSum + numbers[i];
            if(currSum < 0){
                currSum = 0;
            }
            maxSum = Math.max(currSum, maxSum);
        }
        System.out.println("The Max sum in the array is " + maxSum);
    }

    public static void main(String args[]){
        int numbers[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        // int key = 4;
        kadanes(numbers);
        // prefixMaxSubArraysSum(numbers);
        // maxSubArraysSum(numbers);
        // subArrays(numbers);
        // printPairs(numbers);
        // reverse(numbers);
        // for(int i = 0; i < numbers.length; i++){
            // System.out.print(numbers[i] + " ");
        // }
        // System.out.println();
        // System.out.println("The index of the key is " + binarySearch(numbers, key));
        // System.out.println("The largest number is " + getLargest(numbers));
        // int num[] = new int[50];
        // // int marks[] = {12, 15, 19, 20, 17, 18};

        // Scanner sc = new Scanner(System.in);

        // num[0] = sc.nextInt();
        // num[1] = sc.nextInt();
        // num[2] = sc.nextInt();

        // System.out.println("Physics = " + num[0]);
        // System.out.println("Chemistry = " + num[1]);
        // System.out.println("Maths = " + num[2]);
    }
}