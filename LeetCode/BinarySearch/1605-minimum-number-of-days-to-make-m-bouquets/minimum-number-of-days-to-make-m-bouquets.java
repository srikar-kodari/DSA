// BINARY SEARCH
class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;
        if((long) m*k > n) return -1;

        int minEle = Arrays.stream(bloomDay).min().getAsInt();
        int maxEle = Arrays.stream(bloomDay).max().getAsInt();

        int low = minEle;
        int high = maxEle;

        int result = -1;

        while(low <= high) {
            int mid = (low + high)/2;

            if(possibleDay(bloomDay, mid, m, k)) {
                result = mid;
                high = mid - 1;
            }
            else low = mid + 1;
        }
        return result;
    }

    public boolean possibleDay(int bloomDay[], int day, int m, int k) {
        
        int count = 0;
        int totalDays = 0;

        for(int i=0; i<bloomDay.length; i++) {
            if(bloomDay[i] <= day) count++;
            else {
                totalDays += count / k;
                count = 0;
            }
        }
        totalDays += count / k;
        
        return (totalDays >= m);
    }
}