class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> results = new ArrayList<>(nums.length);
		int s = 0;
		for (int i : nums)
			results.add((s = (s * 2 + i) % 5) == 0);

		return results;
    }
}