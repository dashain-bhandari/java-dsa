
// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

// You may assume that each input would have exactly one solution, and you may not use the same element twice.

// You can return the answer in any order.

// Example 1:

// Input: nums = [2,7,11,15], target = 9
// Output: [0,1]
// Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
// Example 2:

// Input: nums = [3,2,4], target = 6
// Output: [1,2]
// Example 3:

// Input: nums = [3,3], target = 6
// Output: [0,1]

import java.lang.reflect.Array;
import java.util.Arrays;

public class Twosum {

    static int[] sum(int[] myNum, int target) {
        int[] sample = new int[2];
        
        for (int i = 0; i < myNum.length ; i++) {
            for (int j = i+1; j < myNum.length ; j++) {
           
                if (myNum[i] + myNum[j] == target) {
                   
                    sample[0]=i;
                    sample[1]=j;
                  
                    return sample;
                }
            }
        }
        return sample;
    }

    public static void main(String[] args) {
        int[] myNum = { 10, 20, 30, 40 };
        int target = 20;
        int[] sample=sum(myNum, target);
        System.out.println(Arrays.toString(sample));
    }
}
