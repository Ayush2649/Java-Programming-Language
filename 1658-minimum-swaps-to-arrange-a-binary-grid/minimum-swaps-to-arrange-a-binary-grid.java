class Solution {
    public int minSwaps(int[][] grid) {
        int zeroCount[] = new int[grid.length];
        int ptr=0;
        for(int[] row : grid){
            int count=0;
            for(int i=row.length-1;i>=0;i--){
                if(row[i]==0) count++;
                else break;
            }
            zeroCount[ptr++] = count;
        }
        int ans = 0;
        for(int i=0;i<zeroCount.length-1;i++){
            if(zeroCount[i] >= zeroCount.length-i-1) continue;
            else{
                boolean found = false;
                for(int j=i+1;j<zeroCount.length;j++){
                    if(zeroCount[j] >= zeroCount.length-i-1){
                        found=true;
                        ans += j-i;
                        while(j>i){
                            int temp = zeroCount[j-1];
                            zeroCount[j-1] = zeroCount[j];
                            zeroCount[j] = temp;
                            j--;
                        }
                        break;
                    }
                }
                if(!found) return -1;
            }
        }
    return ans;
    }
}