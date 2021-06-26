/*
Problem Statement: Given a string s, find the length of the longest substring without repeating characters.

Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
Example 4:

Input: s = ""
Output: 0
*/

/*
Approach 1 : Brute force approach
*/

object LengthOfLongestSubstring {
    def deriveSolution(s: String): Int = {
        
        var maxValue = 0
        if (s.length == 2 && s(0) == s(1)) {
            return 1
        }
        if (s.length <= 2) {
            return s.length
        }
        var tmpString : String = ""
        var contFlag = true
        for (i <- 0 until s.length-1)
        {
            tmpString = s(i).toString
            for (j <- i+1 until s.length)
            {
            if (contFlag == true) {
                if (!tmpString.contains(s(j))) {
                    tmpString += s(j)
                    //println(tmpString)
                    //abcabcbb
                } else {
                    if (maxValue < tmpString.length) maxValue = tmpString.length
                    contFlag = false
                    tmpString = ""
                }
            }
            }
            if(contFlag == true && maxValue < tmpString.length) maxValue = tmpString.length
            contFlag = true
        }
        //println(tmpString)
        if (maxValue > tmpString.length) maxValue else tmpString.length
        //tmpString.length
    }
}

/*
Time Complexity : O(n2)
*/

/*
Approach 2 : Sliding Window
*/

