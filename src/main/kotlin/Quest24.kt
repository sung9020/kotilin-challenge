/*
*
* @author snow
* @since 2024/06/22
*/
class Quest24 {

    val stack = mutableListOf<Pair<Int, Int>>()

    fun compress(chars: CharArray): Int {
        var result = 0
        var counter = 0;
        var first = 0

        while(first < chars.size) {
            var second = first
            while(second < chars.size && chars[first] == chars[second] ) {
                second += 1
                counter += 1
            }

            chars[result++] = chars[first]
            if (counter > 1) {
                for (j in counter.toString()) {
                    chars[result++] = j
                }
            }

            first += counter
            counter = 0 // first 를 리셋

        }

        return result
    }
}

fun main(args :Array<String>) {
    val q = Quest24()
    println(q.compress(charArrayOf('a','a','b','b','c','c','c')))
}

