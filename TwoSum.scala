/*
Problem Statement : Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]

Output: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]

*/

/* 
Solution 1 : Usual Brute-force Approach
*/
object TwoSum {
    def findMatchingValues(nums : Array[Int], target : Int) : Array[Int] = {
        val result = 
        for {i <- 0 until nums.length
            j <- i+1 until nums.length
            if (nums(i) + nums(j) == target)
        } yield Array(i, j)
        result(0)
    }
}

/*
time complexity : O(n2)
space complexiy : O(1)
*/

/* 
Solution 2 : One pass Hash
*/

object TwoSum {
    def findMatchingValues(ar : Array[Int], tar : Int) : Array[Int] = {
        val result = 
        for {i <- 0 until nums.length
            //j <- i+1 until nums.length
            if (nums.contains(target - nums(i)) && nums.indexOf(target - nums(i)) != i)
        } yield Array(i, nums.indexOf(target - nums(i)))
        result(0)
    }
}


/*
time complexity : O(n)
space complexiy : O(1)
*/
