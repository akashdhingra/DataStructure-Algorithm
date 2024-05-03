class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low = Arrays.stream(weights).max().getAsInt();
        int high = Arrays.stream(weights).sum();
        while(low<=high){
            int mid = low + (high-low)/2;
            int no_of_days = noOfDays(weights,mid);
            if(no_of_days <= days){
                high = mid - 1;
            }
            else{
                low = mid+1;
            }
        }
        return low;
    }
    
    public int noOfDays(int[] weights, int cap){
        int days = 1;
        int load = 0;
        for(int i:weights){
            if(load + i > cap){
                days+=1;
                load = i;
            }
            else{
                load+=i;
            }
        }
        return days;
    }
}