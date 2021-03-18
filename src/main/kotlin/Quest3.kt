import kotlin.collections.ArrayList
import kotlin.math.ceil


/*
*
* @author snow
* @since 2021/03/18
*/
fun main(args :Array<String>) {
	val quest3 = Quest3()
	val answer = quest3.solution(intArrayOf(95, 90, 99, 99, 80, 99), intArrayOf(1, 1, 1, 1, 1, 1))
	println("${answer.joinToString(",")}")
}

class Quest3 {
	fun solution(progresses: IntArray, speeds: IntArray): IntArray {
		var answer = intArrayOf()
		var completed = arrayListOf<IntArray>()
		val rest = arrayListOf<IntArray>()
		for(i in progresses.indices){
			val workingDay = ceil((100 - progresses[i]).toDouble() / speeds[i]).toInt()
			if(completed.isEmpty()){
				val item: IntArray = intArrayOf(workingDay, 1)
				push(completed, item)
				// 가장 먼저 완료된 작업이 추가됨
			}else{
				while(completed.size > 0){
					var item: IntArray = pop(completed)// 그이후에 하나씩 팝해서 확인
					if(item[0] >= workingDay) { // 마지막껄 팝했는데 워킹데이가 일치할경우
						item[1] += 1
						push(completed, item)
						break // 작업 끝
					}else{
						val newItem: IntArray = intArrayOf(workingDay, 1)
						push(completed, item)
						push(completed, newItem) // 새로운 아이템을 블록에 쌓으며 끝이난다.
						break
					}
				}
			}
		}
		val answerArray: IntArray = completed.map { item -> item[1] }.toIntArray()
		answer = answerArray
		return answer
	}

	fun push(list: ArrayList<IntArray>, value: IntArray): ArrayList<IntArray> {
		val count = list.count()
		list.add(count, value)
		return list
	}

	fun pop(list: ArrayList<IntArray>): IntArray {
		val count = list.count() - 1
		return list.removeAt(count)
	}
}