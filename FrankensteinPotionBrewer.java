import java.util.*;
import java.util.Arrays;
public class FrankensteinPotionBrewer {
    private static Map<String, List<List<String>>> recipeBook = new HashMap<>();
    private static Map<String, Integer> memo = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); 
        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            String[] parts = line.split("=");
            String potion = parts[0];
            String[] ingredients = parts[1].split("\\+");

            recipeBook.putIfAbsent(potion, new ArrayList<>());
            recipeBook.get(potion).add(Arrays.asList(ingredients));
        }

        String targetPotion = scanner.nextLine();
        scanner.close();
        int result = minOrbsToBrew(targetPotion);
        System.out.println(result);
    }

    private static int minOrbsToBrew(String potion) {
        if (!recipeBook.containsKey(potion)) {
            return 0;
        }
        if (memo.containsKey(potion)) {
            return memo.get(potion);
        }
        int result = Integer.MAX_VALUE;
        for (List<String> recipe : recipeBook.get(potion)) {
            int orbsRequired = recipe.size() - 1; 
            for (String ingredient : recipe) {
                orbsRequired += minOrbsToBrew(ingredient);
            }
            result = Math.min(result, orbsRequired);
        }
        memo.put(potion, result);

        return result;
    }
}
