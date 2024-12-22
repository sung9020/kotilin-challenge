/*
*
* @author snow
* @since 9/7/24
*/
class Quest34 {
    fun minMovesToSeat(seats: IntArray, students: IntArray): Int {
        seats.sort() // 둘다 정렬
        students.sort()

        var result = 0

        for(i in seats.indices){
            val seat = seats[i]
            val student = students[i]

            if(student != seat){
                val move = if(student > seat) student - seat else seat - student
                result += move
            }
        }
        return result
    }

}

fun main(args :Array<String>) {
    val q = Quest34()
    println(q.minMovesToSeat(intArrayOf(3,1,5), intArrayOf(2,7,4)))
}