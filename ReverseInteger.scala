/*
Problem Statement : Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

Example 1:

Input: x = 123
Output: 321
Example 2:

Input: x = -123
Output: -321
Example 3:

Input: x = 120
Output: 21
Example 4:

Input: x = 0
Output: 0

Constraints:

-231 <= x <= 231 - 1
*/

object ReverseInteger {
    def deriveOutput(x: Int): Int = {
        val strInt = x.toString
        try {
        if (strInt(0).toString == "-") {
            if (strInt.slice(1,strInt.length).reverse.toInt < -(Math.pow(2,31))) {
            return 0
            } else {
                return s"-${strInt.slice(1,strInt.length).reverse.toInt}".toInt
            }
            
        }
        else if (strInt.slice(0,strInt.length).reverse.toInt > Math.pow(2,31) - 1) {
            return 0
        } else {
            return strInt.reverse.toInt
        }
        } catch {
            case e : Throwable => return 0
        }
    }
}
