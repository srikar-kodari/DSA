class Solution {
    public int minimumCost(int[] nums) {

        int result = nums[0];

        List<Integer> list = new ArrayList<>();

        for(int i=1; i<nums.length; i++) list.add(nums[i]);

        Collections.sort(list);
        result += list.get(0) + list.get(1);

        return result;
    }
}