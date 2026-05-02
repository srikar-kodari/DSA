class Solution {
    public boolean isHappy(int n) {

        HashSet<Integer> set = new HashSet<>();

        while (n != 1) {

            if (set.contains(n)) return false;

            set.add(n);

            int sum = 0;

            for (char c : String.valueOf(n).toCharArray()) {
                int d = c - '0';
                sum += d * d;
            }

            n = sum;
        }

        return true;
    }
}
