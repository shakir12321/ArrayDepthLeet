package com.excel.arrays;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {3,2,4};
        int target = 6;
        int [] indices = {-1,-1};
        indices = getTarget(nums, target);
        System.out.println(Arrays.toString(indices));
    }

    private static int[] getTarget(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                int sum = nums[i]+ nums[j];
                if(sum == target) return new int[]{i,j};
            }
        }
        return new int[]{-1,-1};

    }
}
