/*
*
* @author snow
* @since 2021/03/19
*/
fun main(args :Array<String>) {
	val quest7 = Quest7()

	val answer = quest7.solution(2, 4)
	println(answer)
}


class Quest7 {
	fun solution(a: Int, b: Int): String {
		var answer = ""
		val dateStr = arrayListOf("FRI","SAT","SUN","MON","TUE","WED","THU")
		val monthMax = intArrayOf(31,29,31,30,31,30,31,31,30,31,30,31)

		if(a == 1) {
			val last = b % dateStr.size
			answer = dateStr[last - 1]
		}else{
			var daySum = 0
			for(i in 1 until a){
				daySum += monthMax[i - 1]
			}
			daySum += b

			val last = daySum % dateStr.size
			if(last> 0){
				answer = dateStr[last - 1]
			}else{
				answer = dateStr[dateStr.size - 1]
			}
		}

		return answer
	}
}