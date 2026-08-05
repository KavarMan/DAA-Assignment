class Solution {
    public int search(int[] nums, int target) {

        int left = 0;
        int right = nums.length-1;

        for(int i=0; i<nums.length; i++){
            int mi = (right + left) / 2; //MiddleIndex
            if(nums[mi] == target){
                return mi;
            }else if(nums[mi] < target){
                left = mi + 1;
            }else{
                right = mi - 1;
            }
        }
        return -1;
    }
}