class Solution {
    public int minPartitions(String n) {
        int apps = 0;
        for (int i = 0; i < n.length(); i++){
            char c = n.charAt(i);
            apps |= 1 << (c - '0');
        }
        return 31 - Integer.numberOfLeadingZeros(apps);
    }
}