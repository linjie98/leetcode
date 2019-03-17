package popular_questions;

import java.util.HashMap;

/**
 * https://leetcode.com/problems/two-sum/
 *
 *
 * Given nums = [2, 7, 11, 15], target = 9,
 *
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 */
class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hashmap = new HashMap();
        int a[] = new int[2];
        for(int i = 0; i < nums.length; i++){
            //如果hashmap中有key说明相加可以为target
            if(hashmap.get(nums[i])!=null){
                //a[0] = i-1;
                a[0] = hashmap.get(nums[i]);
                a[1] = i;
                return a;
            }
            hashmap.put(target-nums[i],i);
        }
        return null;
    }
}