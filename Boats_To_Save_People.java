import java.util.Arrays;
public class Boats_To_Save_People {
    
    public static int minBoats(int[] people, int limit){
        Arrays.sort(people);

        int left = 0;
        int right = people.length - 1;
        int boats = 0;

        while(left <= right){
            // Check if the lightest and the heaviest pople sum comes inside the limit
            if(people[left] + people[right] <= limit){
                left++; // Go for the next lightest person
            } 
            right--; // Go for the next heaviest person
            boats++;
        }
        return boats;
    }

    public static void main(String[] args){
        int[] people = {3, 5, 3, 4};
        int limit = 5;
        int minBoat = minBoats(people, limit);
        System.out.println(minBoat);
    }
}
