class Solution {
    public int findMin(int[] arr) {

        int n = arr.length;
        int low = 0;
        int high = n-1;
        int minNum = Integer.MAX_VALUE;

        while (low <= high) {
            int mid = (low+high)/2;

            //Left Sorted
            if(arr[low] <= arr[mid]) {
                minNum = Math.min(arr[low], minNum);
                low = mid + 1;
            }

            //Right Sorted
            else {
                minNum = Math.min(arr[mid], minNum);
                high = mid - 1;
            }
        }
        return minNum;
        
    }
}