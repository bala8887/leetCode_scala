object Solution {
    def longestCommonPrefix(strs: Array[String]): String = {
        val arraySort = strs.sortBy(_.length)
        var maxLength = arraySort(0).length
        var maxStr = arraySort(0)

        for(i <- 1 until arraySort.length) {
            maxStr = maxStr.intersect(arraySort(i).slice(0,maxLength))
            maxLength = if (maxStr.sameElements(arraySort(i).slice(0,maxLength))) {
                maxStr.length
            } else {
                getSameElements(maxStr, arraySort(i).slice(0,maxLength))
            }
            /*println(maxStr)
            println(arraySort(i).slice(0,maxLength))
            println(maxLength)*/
        }
        maxStr.slice(0, maxLength)
    }
    
    def getSameElements(s1 : String, s2 : String) : Int = {
        println("hi")
        var i = 0
        while(i < s1.length) {
            println(s"${s1(i)}${s2(i)}")
            if (s1(i) != s2(i)) return i
            i += 1
        }
        return i
    }
}
