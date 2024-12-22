import kotlin.math.abs

/*
*
* @author snow
* @since 9/7/24
*/
class Quest38 {
    fun isHappy(n: Int): Boolean {

        val set = hashSetOf<Int>()


        var copyN = n
        var result = false
        while(true){
            var sum = 0
            while(copyN > 0){
                val rest = copyN % 10
                copyN /= 10 // 앞으로 땡기기
                sum += (rest * rest)
            }
            if(sum == 1){
                result = true
                break
            }else if(set.contains(sum)){
                result = false
                break
            }else{
                set.add(sum)
                copyN = sum
            }
        }

        return result
    }

}

fun main(args :Array<String>) {
    val q = Quest38()
    println(q.isHappy(28))
}