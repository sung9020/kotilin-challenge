
/*
*
* @author snow
* @since 2021/03/18
*/
fun main(args :Array<String>) {
	val quest4 = Quest4()
	val array: IntArray = intArrayOf(1, 5, 2, 6, 3, 7, 4)
	val commands: Array<IntArray> = arrayOf( intArrayOf(2,5,3), intArrayOf(4, 4, 1), intArrayOf(1,7,3) )
	val answer = quest4.solution(array,commands)
	println(answer.joinToString(","))
}

class Quest4 {
	fun solution(array: IntArray, commands: Array<IntArray>): IntArray {
		var answer = intArrayOf()
		var answerList = arrayListOf<Int>()

		for(command in commands){
			val i = command[0]
			val j = command[1]
			val k = command[2]

			var sliceArray = array.slice(IntRange(i-1,j-1))
			sliceArray = sliceArray.sorted()
			answerList.add(sliceArray[k-1])
		}


		return answerList.toIntArray()
	}

}