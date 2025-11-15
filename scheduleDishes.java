import java.util.*;
import java.util.Arrays;

public class scheduleDishes {
    public static List<String> scheduleDish(List<String> dishes, int coolDown) {
        List<String> result = new ArrayList<>();
        Map<String, Integer> nextScheduled = new HashMap<>();
        Map<String, Integer> freq = new HashMap<>();

        for (String dish : dishes) { // Store how many times every dish is occouring and initialize next scheduled time
            freq.put(dish, freq.getOrDefault(dish, 0) + 1);
            nextScheduled.putIfAbsent(dish, 0);
        }

        int total = dishes.size();
        int cooked = 0;
        int time = 0;

        while(cooked < total){ // Run until all the dishes are cooked
            String dishString = null;

            for (String dish : freq.keySet()) {
                if (freq.get(dish) > 0 && nextScheduled.get(dish) <= time) { // which dish should be cooked now, basically the first
                    dishString = dish;
                    break;
                }
            }

            if(dishString == null){ // If no dish can be cooked now, add NOTHING to the result

                result.add("NOTHING");

            } else { // If free, add to th result and then remove from the freq list and next scheduled list
                result.add(dishString);

                freq.put(dishString, freq.get(dishString) - 1);
                cooked++;

                nextScheduled.put(dishString, time + coolDown + 1);
            }

            time++;
        }

        return result;
    }

    public static void main(String[] args) {
        List<String> dishes = Arrays.asList("A", "A", "A", "B", "B", "B");
        int coolDown = 2;

        List<String> schedule = scheduleDish(dishes, coolDown);
        System.out.println(schedule);
    }
}