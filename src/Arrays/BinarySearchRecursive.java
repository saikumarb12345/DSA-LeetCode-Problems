package Arrays;

public class BinarySearchRecursive {
    public static void main(String[] args) {
        int[] nums = {-1,0,3,5,9,12};
        int target = 9;
        System.out.println(bsRecursive(nums,0,nums.length-1,target));
    }
    public static int bsRecursive(int[] nums,int start,int end,int target){
        if(start > end){
            return -1;
        }
        int mid = (start+end)/2;
        if(nums[mid] == target){
            return mid;
        }
        else if(nums[mid] < target){
            return bsRecursive(nums,mid+1,end,target);
        }
        else{ // nums[mid] > target
            return bsRecursive(nums,start,mid-1,target);
        }
    }
}
