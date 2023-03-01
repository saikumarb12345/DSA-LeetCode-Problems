package Arrays;

public class MissingNumber {
    public int missingNumber(int[] arr) {
        int i=0;
        while(i<arr.length) {
            int current=arr[i];
            if(arr[i]<arr.length && arr[i]!=arr[current]) {
                swap(arr,i,current);
            }
            else {
                i++;
            }
        }
        for(int k=0;k<arr.length;k++){
            if(arr[k]!=k){
                return k;
            }
        }
        return arr.length;

    }
    public void swap(int[] arr, int first, int second) {
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;

    }
}
