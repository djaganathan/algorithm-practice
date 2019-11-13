package com.dhana.leetcode.algorithm._1.indexes_two_sum;

import java.util.HashMap;
import java.util.Map;

public class Solution1 {

	public static void main(String[] args) {
		int[] nums = new int[] {3,2,4};
		int target = 6; 
		int[] result = twoSum(nums, target);
		for(int i=0;i<result.length;i++) {
			System.out.println(result[i]);
		}
	}
	
    public static int[] twoSum(int[] nums, int target) {
          
        Map<Integer,Integer> numIndex=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            numIndex.put(nums[i],i);
        }
        
        for(int i=0;i<nums.length;i++){
            int leftover = target-nums[i];

            Integer otherIndex =  numIndex.get(leftover);
            if(otherIndex !=null && otherIndex!=i){
                return new int[]{i, otherIndex};   
            }
        }
        
        throw new RuntimeException("No details found");
    }

}
