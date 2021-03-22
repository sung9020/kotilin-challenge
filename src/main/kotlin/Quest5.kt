import java.util.Collections.max

/*
*
* @author snow
* @since 2021/03/18
*/
fun main(args :Array<String>) {
	val quest5 = Quest5()
	val answer = quest5.solution(intArrayOf(1,3,2,4,2))
	println(answer.joinToString(","))
}

class Quest5 {
	fun solution(answers: IntArray): IntArray {
		var answer = intArrayOf()
		val user_1:IntArray = intArrayOf(1,2,3,4,5)
		val user_2:IntArray = intArrayOf(2,1,2,3,2,4,2,5)
		val user_3:IntArray = intArrayOf(3,3,1,1,2,2,4,4,5,5)
		var grade: IntArray = intArrayOf(0,0,0)
		var max = 0

		for(i in answers.indices){
			val value = answers[i]
			if(value == user_1[i % user_1.size]){
				grade[0] += 1
				if(max < grade[0]) max = grade[0]
			}
			if(value == user_2[(i % user_2.size )]){
				grade[1] += 1
				if(max < grade[1]) max = grade[1]
			}
			if(value == user_3[(i % user_3.size)]){
				grade[2] += 1
				if(max < grade[2]) max = grade[2]
			}
		}
		val list: ArrayList<Int> = arrayListOf()
		if(grade[0] == max){
			list.add(1)
		}
		if(grade[1] == max){
			list.add(2)
		}
		if(grade[2] == max){
			list.add(3)
		}
		return list.toIntArray()
	}

}