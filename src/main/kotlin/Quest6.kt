/*
*
* @author snow
* @since 2021/03/19
*/
fun main(args :Array<String>) {
	val quest6 = Quest6()

	val answer = quest6.solution("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
	println(answer)
}


class Quest6 {
	fun solution(s: String): Int {
		var answer = 1000
		if (s.length == 1) answer = 1
		for(i in 1 until s.length){
			val strDic = hashMapOf<String, Int>()
			val sliceList = s.chunked(i)
			var sum = 0
			var current: String = ""
			var count = 0
			for(i in sliceList.indices){
				if(current == sliceList[i]) {
					count += 1
					continue
				}
				if(i < sliceList.size - 1){
					if(sliceList[i] == sliceList[i+1]){
						// 글자수 + 숫자값
						sum += sliceList[i].length
						current = sliceList[i]
						count += 1
					}else {
						// 그외에는 글자 수만큼 합산
						sum += sliceList[i].length
						current = sliceList[i]
						count = 0
					}
				}else{
					// 그외에는 글자 수만큼 합산
					sum += sliceList[i].length
					current = sliceList[i]
				}
			}
			if(answer > sum) answer = sum
		}
		return answer
	}
}