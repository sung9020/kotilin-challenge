/*
*
* @author snow
* @since 2021/05/05
*/
fun main(args :Array<String>) {
	val quest10 = Quest10()
	val answer = quest10.solution(5, 12)
	var arr = intArrayOf(3,5,1,0,2)
	arr = quest10.quickSort(arr)
	println(arr.joinToString(","))
	println(answer)
}


class Quest10 {
	fun solution(N: Int, number: Int): Int {
		var answer = 0
		var listSet = ArrayList<HashSet<Int>>()
		listSet.add(hashSetOf(0))

		for(i in 1..8) {
			listSet.add(i, hashSetOf("1".repeat(i).toInt() * N))

			for(j in 1..i){
				for(q in listSet[j]){
					for( r in listSet[i-j]){
						listSet[i].add(q + r)
						listSet[i].add(q - r)
						listSet[i].add(q * r)
						if(r != 0){
							listSet[i].add(q / r)
						}
					}
				}
			}

			if(listSet[i].contains(number)){
				answer = i
				return answer
			}
		}
		return -1
	}

	fun getResult(before: Int, After: Int, operator: String): Int {
		when(operator){
			"+" -> return (before + After)
			"-" -> return (before - After)
			"/" -> return (before / After)
			"*" -> return (before * After)
		}
		return -1
	}

	fun quickSort(arr: IntArray): IntArray {
		if (arr.size < 2) return arr

		var pivot = arr[arr.size / 2];

		var equal = arr.filter { it == pivot }.toIntArray()
		var less = arr.filter { it < pivot }.toIntArray()
		var bigger = arr.filter { it > pivot }.toIntArray()
		return quickSort(less) + equal + quickSort(bigger)
	}
}


