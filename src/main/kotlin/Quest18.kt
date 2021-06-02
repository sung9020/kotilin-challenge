import java.lang.StringBuilder

/*
*
* @author snow
* @since 2021/05/06
*/
fun main(args :Array<String>) {
	val quest18 = Quest18()
	val answer = quest18.solution("abcdefg")
	println(answer)
}


class Quest18 {
	fun solution(name: String): String {
		var answer = 0
		var arrayList: ArrayList<Char> = name.toCharArray().toList() as ArrayList<Char>
		var sb = StringBuilder()
		while(arrayList.isNotEmpty()){
			sb.append(arrayList.removeAt(arrayList.size-1))
		}
		리스트에서 합이 n이 되는 두원소 찾기
				스택 두개로 큐 구현하기

		return sb.toString()
	}
}