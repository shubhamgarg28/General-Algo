package leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSums {
	
	public static int findIndex(int[] nums, int target) {
		for (int i =0 ; i< nums.length ; i++) {
			if (nums[i] == target) {
				return i;
			}
			
		}
		return -1;
	}
	
	
public static int[] twoSum(int[] nums, int target) {
        int[] output = {-1, -1};
        Map<Integer, Integer> valuemap = new HashMap<>();
        for (int i =0 ; i < nums.length ; i++) {
            valuemap.put(nums[i],i);
            
        }
        
        for (int i = 0; i < nums.length ; i++) {
        	int num = nums[i];
            if (valuemap.containsKey(target - num) && i != valuemap.get(num)) {
               output[0] = i;
               output[1] = findIndex(nums, target-num);
               return output;
            }
        }
		return output ;
        
    }
	

	public static void main(String[] args) {
		int[] nums = {3,2,4};
		int target = 6;
		int[] output = twoSum(nums, target);
		for (int num : output) {
			System.out.println(num);
		}

	}

}
