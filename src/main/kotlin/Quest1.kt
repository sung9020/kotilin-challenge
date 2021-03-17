/*
*
* @author snow
* @since 2021/03/17
*/

fun main(args :Array<String>) {

	var arr: Array<Array<String>> = arrayOf(arrayOf<String>("crow_mask", "face"))
	arr += arrayOf(arrayOf<String>("blue_sunglasses", "face"))
	arr += arrayOf(arrayOf<String>("smoky_makeup", "face"))
	val solution = Solution()
	val sum = solution.solution(arr)
	println("$sum")
}

class Solution {
	fun solution(clothes: Array<Array<String>>): Int {
		var answer = 1
		val items: HashMap<String, Int?> = HashMap()
		for(cloth in clothes){
			if(items[cloth[1]] == null) {
				items[cloth[1]] = 1
			}
			else {
				items[cloth[1]] = items[cloth[1]]?.plus(1)
			}
		}

		for(item in items){
			answer *= (item.value!! + 1)
		}

		return answer - 1
	}
}