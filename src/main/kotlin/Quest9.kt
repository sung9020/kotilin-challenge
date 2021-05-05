/*
*
* @author snow
* @since 2021/05/04
*/
fun main(args :Array<String>) {
	val quest9 = Quest9()
	val answer = quest9.solution(intArrayOf(3,8,9,7,6), 3)
	println(answer.joinToString(","))
}


class Quest9 {
	fun solution(A: IntArray, K: Int): IntArray {
		// write your code in Kotlin
		var answer = IntArray(A.size){0}

		if(A.isEmpty()) return intArrayOf()

		val rotate = K % A.size // 회전수

		for(i in A.indices){
			if(rotate + i > A.size -1) {
				answer[rotate + i - A.size] = A[i]
			}else{
				answer[rotate + i] = A[i]
			}
		}

		return answer
	}
}