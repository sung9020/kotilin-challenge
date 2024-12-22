/*
*
* @author snow
* @since 9/7/24
*/
class Quest26 {
    fun maxVowels(s: String, k: Int): Int {
        val dic = setOf('a', 'e', 'i', 'o', 'u')
        var max = Int.MIN_VALUE

        var count = 0
        for( i in 0 until  k){
            if(dic.contains(s[i])){
                count++
            }
        }

        max = Math.max( max, count)
        var index = k
        while(index < s.length){
            if(dic.contains(s[index])){
                count++
            }

            if(dic.contains(s[index - k])){
                count--
            }

            max = Math.max( max, count)

            index++
        }

        return max
    }
}

fun main(args :Array<String>) {
    val q = Quest26()
    println(q.maxVowels("abciiidef",3))
}