package Arrays;

import java.util.ArrayList;
import java.util.List;

//Find All Numbers Disappeared in an Array
public class DisapperadInArray {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i=0;
        List<Integer> list = new ArrayList<>();
        while(i < nums.length){
            int current = nums[i] - 1;
            if(nums[i] != nums[current]){
                swap(i,current,nums);
            }
            else{
                i++;
            }
        }
        for(int k=0;k<nums.length;k++){
            if(nums[k]!=k+1){
                list.add(k+1);
            }
        }
        return list;
    }
    public void swap(int first,int second,int[] arr){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
