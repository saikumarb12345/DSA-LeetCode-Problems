package Arrays;

public class SortByParity {
    public int[] sortArrayByParity(int[] nums) {
        if(nums.length==1){
            return nums;
        }
        int start = 0;
        int end = nums.length-1;
        while(start<end){
            if(nums[start]%2==0){
                start++;
            }
            else{
                int temp = nums[end];
                nums[end--] = nums[start];
                nums[start] = temp;
            }
        }
        return nums;
    }
}
