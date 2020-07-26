class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int [] solution = new int[2];
        for(int x = 0; x < nums.length; x++)
            for(int y = 0; y < nums.length; y++)
            {
                if(x != y)
                {
                    if((nums[x] + nums[y]) == target)
                    {
                        solution[0] = x;
                        solution[1] = y;
                    }
                }
            }
        
        return solution;
    }
}