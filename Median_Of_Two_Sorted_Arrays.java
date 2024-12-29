public class Median_Of_Two_Sorted_Arrays {
    // public static  double findMedianSortedArrays1(int[] nums1, int[] nums2) { TC : O(m + n) SC : O(m + n)
    //     int m = nums1.length;
    //     int n = nums2.length;
    //     int nums3[] = new int[m + n];

    //     int i = 0, j = 0, k = 0;

    //     while(i < m && j < n){
    //         if(nums1[i] < nums2[j]){
    //             nums3[k++] = nums1[i++];
    //         } else {
    //             nums3[k++] = nums2[j++];
    //         }
    //     }

    //     while(i < m){
    //         nums3[k++] = nums1[i++];
    //     }

    //     while(j < n){
    //         nums3[k++] = nums2[j++];
    //     }

    //     int totalLength = m + n;

    //     if(totalLength % 2 == 1){
    //         return nums3[totalLength / 2];
    //     }

    //     return (nums3[totalLength / 2] + nums3[(totalLength / 2) - 1]) / 2.0;
    // }

    public static double findMedianSortedArrays2(int[] nums1, int[] nums2) { // TC : O(m + n) SC : O(1)
        int m = nums1.length;
        int n = nums2.length;
        int i = 0, j = 0;
        int totalLength = m + n;
        int ind2 = totalLength / 2;
        int ind1 = ind2 - 1;
        int cnt = 0;
        int ind1el = -1, ind2el = -1;
    
        while(i < m && j < n){
            if(nums1[i] < nums2[j]){
                if(cnt == ind1) ind1el = nums1[i];
                if(cnt == ind2) ind2el = nums1[i];
                cnt++;
                i++;
            } else {
                if(cnt == ind1) ind1el = nums2[j];
                if(cnt == ind2) ind2el = nums2[j];
                cnt++;
                j++;
            }
        }
    
        while(i < m){
           if(cnt == ind1) ind1el = nums1[i];
           if(cnt == ind2) ind2el = nums1[i];
            cnt++;
            i++;
        }
    
        while(j < n){
            if(cnt == ind1) ind1el = nums2[j];
            if(cnt == ind2) ind2el = nums2[j];
            cnt++;
            j++;
        }
    
        if(totalLength % 2 == 1){
            return ind2el;
        }
    
        return (ind1el + ind2el) / 2.0;
    }

    public static void main(String[] args){
        int[] nums1 = {1, 3};
        int nums2[] = {2, 3, 4};
        System.out.println(Median_Of_Two_Sorted_Arrays.findMedianSortedArrays2(nums1, nums2));
    }
}
