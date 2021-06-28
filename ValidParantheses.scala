/*
Problem Statement : Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.

Example 1:
Input: s = "()"
Output: true

Example 2:
Input: s = "()[]{}"
Output: true

Example 3:
Input: s = "(]"
Output: false

Example 4:
Input: s = "([)]"
Output: false

Example 5:
Input: s = "{[]}"
Output: true
*/

object ValidParantheses {
    def isValid(s: String): Boolean = {
        var firstTimeFlag = true
        var ar : Array[String] = Array.empty
        val m = Map(")" -> "(", "]" -> "[", "}" -> "{")
        
        for (i <- s) {
            if (firstTimeFlag == true) {
                ar = ar :+ i.toString
                firstTimeFlag = false
            } else {
                if(ar.last == m.getOrElse(i.toString, "")) {
                    ar = ar.dropRight(1)
                    if (ar.isEmpty == true) firstTimeFlag = true
                } else {
                    ar = ar :+ i.toString
                }
            }
        }
        ar.length == 0
    }
}
