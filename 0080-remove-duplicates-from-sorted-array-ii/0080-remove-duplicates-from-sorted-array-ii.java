class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums == null) return 0;

    int n = nums.length;

if(n <= 2) return n;
int k = 0;
for (int i = 0; i<n; i++){
    if (k < 2 || nums[i]!= nums [k-2]) {
        nums [k] = nums [i];
        k++;
    }
   }
    return k;
        
    }
}
