package Arrays;
import java.util.Arrays;
import java.util.HashMap;

//How Many Numbers Are Smaller Than the Current Number
public class SmallerThanCurrentNumber {
        public int[] smallerNumbersThanCurrent(int[] nums) {

            Map<Integer,Integer> hm = new HashMap<>();
            int[] temp = nums.clone();
            Arrays.sort(temp);

            for(int i=0;i<nums.length;i++){
                hm.putIfAbsent(temp[i],i);
            }
            for(int i=0;i<nums.length;i++){
                temp[i] = hm.get(nums[i]);
            }
            return temp;
        }

}
