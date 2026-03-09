class Solution {
    public int minimumSum(int num) {

        char[] arr = String.valueOf(num).toCharArray();
        Arrays.sort(arr);

        int n1 = (10 * (arr[0]-'0') + arr[2]-'0');
        int n2 = (10 * (arr[1]-'0') + arr[3]-'0');

        return n1 + n2;
    }
}
