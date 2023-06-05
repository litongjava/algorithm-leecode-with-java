package com.ppnt.leecode;

import java.util.Arrays;

/**
 * @author Ping E Lee
 * 1480. 一维数组的动态和
 * https://leetcode.cn/problems/running-sum-of-1d-array/
 */
public class Code_1480 {
  class Solution {
    // public int[] runningSum(int[] nums) {
    // int length=nums.length;
    // int[] dst=new int[length];
    // int sum=0;
    // for(int i=0;i<length;i++) {
    // sum+=nums[i];
    // dst[i]=sum;
    // }
    // return dst;
    // }

    public int[] runningSum(int[] nums) {
      for (int i = 1; i < nums.length; i++) {
        nums[i]+=nums[i-1];
      }
      return nums;
    }

  }

  public static void main(String[] args) {
    Code_1480 code = new Code_1480();
    Solution solution = code.new Solution();
    int[] nums = { 1, 2, 3, 4 };
    int[] runningSum = solution.runningSum(nums);
    System.out.println(Arrays.toString(runningSum));
    nums = new int[] { 3, 1, 2, 10, 1 };
    runningSum = solution.runningSum(nums);
    System.out.println(Arrays.toString(runningSum));
  }
}
