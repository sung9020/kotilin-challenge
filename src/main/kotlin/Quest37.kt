import kotlin.math.abs

/*
*
* @author snow
* @since 9/7/24
*/
class Quest37 {
    fun containsNearbyDuplicate(nums: IntArray, k: Int): Boolean {
        var result  = false
        // i , j , abs
        val map = hashMapOf<Int, Triple<Int, Int, Int>>()

        for( j in nums.indices){
            val value = nums[j]
            if(map.containsKey(nums[j])){
                map[value]?.let{ item ->
                    val i = item.first
                    val abs = abs(j - i)
                    if(abs <= k){
                        return true
                    }

                    map[value] = Triple(j, j, abs) // 현재 위치로 모두를 옮기고, 절대값 갱신
                }
            }else{
                map[value] = Triple(j, j, 0)
            }
        }

        return result
    }
}

fun main(args :Array<String>) {
    val q = Quest37()
    println(q.containsNearbyDuplicate(intArrayOf(1,2,3,1,2,3), 3))
}