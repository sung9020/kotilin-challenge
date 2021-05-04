/*
*
* @author snow
* @since 2021/03/19
*/
fun main(args :Array<String>) {
	val quest8 = Quest8()

	val numbers = intArrayOf(1, 2, 1, 2)
	val answer = quest8.solution( numbers, 2)
	println(answer)
}


class Quest8 {
	fun solution(numbers: IntArray, target: Int): Int {
		var answer = 0

		var marks = IntArray(numbers.size){0}
		var totalNum = 0
		answer = recv(0, numbers[0], numbers, marks, target )
		answer += recv(0, -numbers[0], numbers, marks, target )
		return answer
	}

	fun recv(current: Int, tempNum: Int, numbers: IntArray, marks: IntArray, target: Int): Int {
		var result = 0

		if (current == numbers.size - 1){
			return if(tempNum == target) 1
			else 0
		}else{
			marks[current] = 1
			result += recv(current + 1, tempNum + numbers[current + 1], numbers, marks, target)
			result += recv(current + 1, tempNum - numbers[current + 1], numbers, marks, target)
		}

		return result
	}

}