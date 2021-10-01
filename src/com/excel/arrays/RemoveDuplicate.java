package com.excel.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] nums = {1,1,2};
        int[] len = removeDuplicates(nums);
        System.out.println(Arrays.toString(len));
    }

    public static int[] removeDuplicates(int[] nums) {

        int indexcounter = 0;

        for (int i = 0; i < nums.length; i++) {
            if(nums[indexcounter] != nums[i]){
                indexcounter++;
                nums[indexcounter] = nums[i];
            }
        }
        nums = Arrays.copyOfRange(nums,0,indexcounter+1);
        return nums;

    }
//    public static int[] removeDuplicates(int[] nums) {
//        Map<Integer, Integer> map = new HashMap<>();
//     //   int[] newnums;
//        int j = 0;
//        int k = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if (!map.containsValue(nums[i])) {
//                map.put(k, nums[i]);
//                //newnums[j] = nums[i];
//                j++;
//                k++;
//            }
//        }
//        Integer[] newnums = map.keySet().toArray(new Integer[0]);
//        int[] smallnums = new int[map.size()];
//        int l = 0;
//        for (Integer n : newnums) {
//            smallnums[l] = n;
//            l++;
//        }
//
//        return smallnums;
//    }
}

