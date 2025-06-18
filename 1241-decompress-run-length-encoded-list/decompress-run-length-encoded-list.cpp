class Solution {
public:
    vector<int> decompressRLElist(vector<int>& nums) {
        
        int l = 0;
        int r = 1;
        vector<int> res;
        while(l< nums.size() && r<nums.size())
        {
            for(int j = 0; j<nums[l]; j++){
                  res.push_back(nums[r]);
            }
            l+=2;
            r+=2;
        }
        return res;
    }
};