import kotlin.math.sign

/*
*
* @author snow
* @since 2021/05/05
*/
fun main(args :Array<String>) {
	val quest11 = Quest11()
	val answer = quest11.solution(intArrayOf(212, 22,44,5))
	println(answer)
}


class Quest11 {
	fun solution(numbers: IntArray): String {
		var answer = ""
		var max: Int = 0
		var swap: Int = 0

		val comparator = Comparator { a: Int, b: Int -> (a.toString() + b.toString()).toLong().compareTo((b.toString() + a.toString()).toLong()) }
		answer = numbers.sortedWith(comparator).reversed().joinToString("")
		var value = answer.toLongOrNull()
		if(value == 0L) {
			return "0"
		}else{
			return answer
		}
	}

}