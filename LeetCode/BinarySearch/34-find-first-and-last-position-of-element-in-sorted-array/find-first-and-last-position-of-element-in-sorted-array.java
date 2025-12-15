class Solution {
    public int[] searchRange(int[] arr, int target) {

        int firstOccurence = firstOccurence(arr, arr.length, target);

        if(firstOccurence == -1) return new int[] {-1,-1};

        int lastOccurence = lastOccurence(arr, arr.length, target);

        return new int[] {firstOccurence, lastOccurence};
    }

    public int firstOccurence(int[] arr, int n, int target) {    //Lower Bound

        int low = 0;
        int high = n-1;
        int firstOccurence = -1;

        while(low <= high) {
            int mid = (low+high)/2;

            if(arr[mid] >= target) {
                firstOccurence = mid;
                high = mid-1;
            }
            else low = mid+1;
        }

        if(firstOccurence != -1 && arr[firstOccurence] == target) return firstOccurence;    //Condition
        else return -1;
    }

    public int lastOccurence(int[] arr, int n, int target) {
        int low = 0;
        int high = n - 1;

        int lastOccurence = -1;

        while(low <= high) {
            int mid = (low + high)/2;

            if(arr[mid] == target) {
                lastOccurence = mid;
                low = mid + 1;
            }
            else if(arr[mid] < target) low = mid + 1;
            else high = mid - 1;
        }
        return lastOccurence;
    }

}