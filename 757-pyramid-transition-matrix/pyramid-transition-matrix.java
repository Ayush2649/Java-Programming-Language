class Solution {
    private Map<String, Boolean> t = new HashMap<>();

    public boolean pyramidTransition(String bottom, List<String> allowed) {
        // Build mapping from pair -> list of possible top blocks
        Map<String, List<Character>> mp = new HashMap<>();
        for (String pattern : allowed) {
            String pair = pattern.substring(0, 2);
            char top = pattern.charAt(2);
            mp.computeIfAbsent(pair, k -> new ArrayList<>()).add(top);
        }

        return solve(bottom, mp, 0, new StringBuilder());
    }

    private boolean solve(String curr, Map<String, List<Character>> mp, int idx, StringBuilder above) {
        if (curr.length() == 1) {
            // Pyramid is complete
            return true;
        }

        String key = curr + "_" + idx + "_" + above.toString();
        if (t.containsKey(key)) {
            return t.get(key);
        }

        if (idx == curr.length() - 1) {
            // Finished building current above row; move up
            boolean result = solve(above.toString(), mp, 0, new StringBuilder());
            t.put(key, result);
            return result;
        }

        String pair = curr.substring(idx, idx + 2);
        if (!mp.containsKey(pair)) {
            t.put(key, false);
            return false;
        }

        for (char ch : mp.get(pair)) {
            above.append(ch); // DO
            if (solve(curr, mp, idx + 1, above)) { // EXPLORE
                t.put(key, true);
                return true;
            }
            above.deleteCharAt(above.length() - 1); // UNDO
        }

        t.put(key, false);
        return false;
    }
}