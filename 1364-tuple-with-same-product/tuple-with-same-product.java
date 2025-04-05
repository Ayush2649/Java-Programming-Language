class Solution {
    public int tupleSameProduct(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);

        int totalNumberOfTuples = 0;

        for(int aIndex = 0; aIndex < n; aIndex++){
            for(int bIndex = n - 1; bIndex >= aIndex + 1; bIndex--){
                int product = nums[aIndex] * nums[bIndex];

                Set<Integer> possibleDValues = new HashSet<>();
                for(int cIndex = aIndex + 1; cIndex < bIndex; cIndex++){
                    if(product % nums[cIndex] == 0){
                        int dIndex = product / nums[cIndex];

                        if(possibleDValues.contains(dIndex)){
                            totalNumberOfTuples += 8;
                        }

                        possibleDValues.add(nums[cIndex]
                        );
                    }
                }
            }
        }
        return totalNumberOfTuples;
    }
}