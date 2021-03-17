import java.util.*
import kotlin.collections.HashMap

/*
*
* @author snow
* @since 2021/03/18
*/

fun main(args :Array<String>) {
	val quest2 = Quest2()
	val answer = quest2.solution(intArrayOf(2,1,3,4,1))
	println("${answer.joinToString(",")}")
}

class Quest2 {
	fun solution(numbers: IntArray): IntArray {
		var answer: IntArray = intArrayOf()
		val hashSet: HashSet<Int> = hashSetOf()
		for(i in numbers.indices){
			for(j in i until numbers.size){
				if(i == j) continue
				hashSet.add(numbers[i] + numbers[j])
			}
		}
		answer = hashSet.sorted().toIntArray()
		return answer
	}
}