package Arrays;

public class HeightChecker {
    public int heightChecker(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++)  {
            hm.put(i,nums[i]);
        }
        //5 1 2 3 4
        Arrays.sort(nums);
        //1 2 3 4 5
        int count = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=hm.get(i)){
                count++;
            }
        }
        return count;
}
