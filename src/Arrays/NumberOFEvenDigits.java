package Arrays;
//Find Numbers with Even Number of Digits
public class NumberOFEvenDigits {
    public int findNumbers(int[] nums) {
        int count  = 0;
        for(int i=0;i<nums.length;i++){
            if((isEven(nums[i])%2==0)){
                count++;
            }
        }
        return count;
    }
    public int isEven(int num){
        int count = 0;
        while(num>0){
            count++;
            num = num / 10;
        }
        return count;
    }
}
