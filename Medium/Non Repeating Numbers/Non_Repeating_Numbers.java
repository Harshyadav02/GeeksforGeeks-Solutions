class Solution
{
    public int[] singleNumber(int[] nums)
    {
       int extra_array [] = new int[2];
        int index = 0;
        HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            if (hmap.containsKey(nums[i])) {
                hmap.put(nums[i], hmap.get(nums[i]) + 1);
            } else {
                hmap.put(nums[i], 1);
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (hmap.get(nums[i]) == 1) {
                extra_array[index] = nums[i];
                index++;
            }
        }

        if (extra_array[0] > extra_array[1]) {
            int temp = extra_array[0];
            extra_array[0] = extra_array[1];
            extra_array[1] = temp;
        }

        return extra_array;
    }
}
