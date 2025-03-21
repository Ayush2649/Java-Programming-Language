class Solution {
    public List<String> findAllRecipes(String[] recipes, List<List<String>> ingredients, String[] supplies) {
        int n = recipes.length;
        List<String> result = new ArrayList<>();
        Set<String> st = new HashSet<>(Arrays.asList(supplies));
        boolean cooked[] = new boolean[n];
        int count = n;

        while(count-- > 0){
            for(int j = 0; j < n; j++){
                if(cooked[j]){
                    continue;
                }

                boolean canMake = true;
                for(String ing : ingredients.get(j)){
                    if(!st.contains(ing)){
                        canMake = false;
                        break;
                    }
                }

                if(canMake){
                    st.add(recipes[j]);
                    result.add(recipes[j]);
                    cooked[j] = true;
                }
            }
        }

        return result;
    }
}