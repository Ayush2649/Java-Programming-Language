class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        triangle.add(new ArrayList<>() {{
            add(1);
        }});

        for(int i = 1; i < numRows; i++){
            List<Integer> prev = triangle.get(i - 1);
            List<Integer> current = new ArrayList<>();

            current.add(1);

            for(int j = 1; j < prev.size(); j++){
                current.add(prev.get(j - 1) + prev.get(j));
            }

            current.add(1);

            triangle.add(current);
        }

        return triangle;
    }
}