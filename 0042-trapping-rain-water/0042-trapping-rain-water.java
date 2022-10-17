class Solution {
    public int trap(int[] arr) {
        int size=arr.length;
        int larr[] = new int[size];
        int rarr[] = new int[size];
        larr[0] = arr[0];
        for(int i = 1 ; i< size ; i++){
            larr[i] = Math.max(arr[i] , larr[i - 1]);
        }
        rarr[size - 1] = arr[size - 1];
        for(int i = size - 2 ; i>=0 ; i--){  
            rarr[i] = Math.max(arr[i] , rarr[i + 1]);
        }
        
        int sum = 0 ;
        for(int i = 0 ; i< size ; i++){
            int result =Math.min(larr[i] , rarr[i]) - arr[i];
            sum +=result;
        }
            return sum;
        
    }
}