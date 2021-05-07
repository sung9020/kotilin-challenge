/*
*
* @author snow
* @since 2021/05/05
*/

fun main(args :Array<String>) {
	val quest12 = Quest12()
	val answer = quest12.solution(3,5, intArrayOf(2,1,5,1,2,2,2))
	println(answer)
}

class Quest12 {
	fun solution(K: Int, M: Int, A: IntArray): Int {
		// write your code in Kotlin
		var min = M
		var max = A.sum()

		var answer = max

		while(min <= max){
			var mid = (min + max) / 2

			var isOk = isDiv(mid, K, A)

			if(isOk){
				answer = mid
				max = mid - 1
			}else{
				min = mid + 1
			}
		}

		return answer
	}

	fun isDiv(mid: Int, K: Int, A:IntArray): Boolean {
		var kCnt = K
		var currentSum = 0

		for(i in A.indices){
			currentSum += A[i]

			if(currentSum > mid){
				kCnt--
				currentSum = A[i]
			}

			if(kCnt == 0){
				return false
			}
		}

		return true
	}

}