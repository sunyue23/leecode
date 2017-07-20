package com.kingnet.sy;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by sunyue on 2017/6/6.
 */

/*
Given an array of integers, return indices of the two numbers such that they add up to a specific target.

        You may assume that each input would have exactly one solution, and you may not use the same element twice.

        Example:

        Given nums = [2, 7, 11, 15], target = 9,

        Because nums[0] + nums[1] = 2 + 7 = 9,
        return [0, 1].
*/



public class LeeCode1 {
    public static void main(String[] args) {
        int[] numbers = new int[]{3,8,2,7,4};
        int target = 6;
        int[] a  = twoSum(numbers,target);
        for(int i = 0;i<a.length;i++) {
            System.out.println(a[i]);
        }
    }
    //答案
    public static int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < numbers.length; i++) {
            if (map.containsKey(target - numbers[i])) {
                result[1] = i ;
                result[0] = map.get(target - numbers[i]);
                return result;
            }
            map.put(numbers[i], i );
        }
        return result;
    }
}
