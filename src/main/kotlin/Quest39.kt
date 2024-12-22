import javax.swing.text.html.HTML.Tag
import kotlin.math.abs

/*
*
* @author snow
* @since 9/7/24
*/
class Quest39 {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = HashMap<Int, Int>()

        for(i in nums.indices){
            val rest: Int = map[target - nums[i]] ?: -1
            if(map.containsKey(target - nums[i])){
                return intArrayOf(rest, i)
            }

            map[nums[i]] = i // 인덱스 넣기
        }

        return intArrayOf()
    }
}

fun main(args :Array<String>) {
    val q = Quest39()
    println(q.twoSum(intArrayOf(3,2,4), 6).joinToString(","))
}