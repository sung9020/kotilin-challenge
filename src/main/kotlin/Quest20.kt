import kotlin.streams.toList

/*
*
* @author snow
* @since 2021/05/06
*/
fun main(args :Array<String>) {
	val quest20 = Quest20()
	val answer = quest20.solution("1\n2\n5\n10")
	println(answer)
}


class Quest20 {
	fun solution(input: String): Int {
		var inputStr = input.toString()
		var answer = 0

		if(inputStr.isEmpty()){
			return answer
		}else {
			var times: IntArray = inputStr.split("\n").map {it.toInt()}.sorted().toIntArray()
			if(times.isEmpty()){
				answer += 0
			}else if(times.size == 1){
				answer += times[0]
			}else if(times.size == 2){
				answer += (times[1])
			}else if(times.size == 3){
				answer += (times[1] + times[0] + times[2])
			}else{
				while(times.size >=4 ){
					val caseA = times[times.size -2] + times[0] + times.last() + times[0]
					val caseB = times[1] + times[0] + times.last() + times[1]

					if(caseA > caseB){
						answer += caseB
					}else{
						answer += caseA
					}

					times = times.slice(0..times.size - 2).toIntArray()
					times = times.slice(0..times.size - 2).toIntArray()
				}
				if(times.size == 1){
					answer += times[0]
				}
				if(times.size == 2){
					answer += (times[1])
				}
				if(times.size == 3){
					answer += (times[1] + times[0] + times[2])
				}
			}
			return answer
		}

	}
}