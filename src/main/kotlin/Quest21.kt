/*
*
* @author snow
* @since 2021/05/06
*/
fun main(args :Array<String>) {
	val quest21 = Quest21()
	val answer = quest21.solution("a3c11d1c3d3")
	println(answer)
}


class Quest21 {
	fun solution(input: String): String {
		var answer = StringBuilder()

		var regex = "^[a-z]{1}[0-9]{1,100}".toRegex()
		var dic = linkedMapOf<String, Int>()
		var sb: StringBuilder = StringBuilder()
		for(i in input.indices){
			if(i < input.length - 1 && input[i].toString().toIntOrNull() != null && input[i + 1].toString().toIntOrNull() != null ) {
				sb.append(input[i])
				continue
			}
			sb.append(input[i])
			var str = sb.toString()
			if(regex.matches(str)){
				var first = str[0].toString()
				var second = str.substring(1 until str.length).toInt()
				if(dic.containsKey(first)){
					dic[first] = dic.getOrDefault(first,0) + second
				}else{
					dic[first] = second
				}
				sb.clear()
			}
		}
		for(e in dic){
			answer.append(e.key)
			answer.append(e.value)
		}

		return answer.toString()
	}


}