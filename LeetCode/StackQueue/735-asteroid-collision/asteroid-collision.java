class Solution {
    public int[] asteroidCollision(int[] arr) {

        int n = arr.length;
        ArrayList<Integer> stack = new ArrayList<>();    // Functions as Stack

        for(int i=0; i<n; i++) {

            if(arr[i] > 0) stack.add(arr[i]);

            else {
                while (!stack.isEmpty() && stack.getLast() > 0 && stack.getLast() < Math.abs(arr[i])) {
                    
                    stack.removeLast();
                }

                if(!stack.isEmpty() && stack.getLast() == Math.abs(arr[i])) {
                    stack.removeLast();
                }

                else if(stack.isEmpty() || stack.getLast() < 0) {
                    stack.add(arr[i]);
                }

            }
        }

        return stack.stream().mapToInt(Integer::intValue).toArray();
    }
}
