package com.dhana.leetcode.algorithm._4.median_two_sorted_array;

public class Solution1 {
	
	public static void main(String[] args) {
		int[] nums1= new int[] {1, 2};
		int[] nums2= new int[] {3, 4};
		
		System.out.println("median--"+findMedianSortedArrays(nums1,nums2));
				

	}
	
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int[] whole = new int[nums1.length+nums2.length];
        
        int wholeIdx=0, nums1Idx = 0, nums2Idx=0;
        boolean merge=true;
        while(merge){
            if(nums1Idx<nums1.length && nums2Idx<nums2.length){
                int value1 = nums1[nums1Idx];
                int value2 = nums2[nums2Idx];
                if(value1<=value2){
                    whole[wholeIdx] = value1;
                    nums1Idx+=1;
                    wholeIdx+=1;
                } else {
                    whole[wholeIdx] = value2;
                    nums2Idx+=1;
                    wholeIdx+=1;
                }
            } else if(nums1Idx<nums1.length) {
            		whole[wholeIdx] = nums1[nums1Idx];
                nums1Idx+=1;
                wholeIdx+=1;
            } else if(nums2Idx<nums2.length) {
            		whole[wholeIdx] = nums2[nums2Idx];
                nums2Idx+=1;
                wholeIdx+=1;
            }else {
            		merge=false;
            }
        }
        
        int oddCheck = whole.length %2;
        double median = 0;
        if(oddCheck>0) {
        		median = whole[whole.length/2];
        }else {
        		double median1=whole[whole.length/2-1];
        		double median2=whole[whole.length/2];
        		median=(median1+median2)/2;
        }
       return median;
    }
}