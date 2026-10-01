class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        int n = nums.length;
        int ans = 0;

        for(int i = 0; i < n; i++ ){
            int count = 0;

            for(int j = 0; j < n; j++){
                if(nums[i] == nums[j]){
                    count++;
                }
            }
            if(count == 2){
                boolean found = false;

                for(int k = 0; k < i; k++){
                    if(nums[k] == nums[i]){
                        found = true;
                        break;

                    }
                }
                if(!found){            
                ans ^= nums[i];
                }
            }
        }
        return ans;
    }
}