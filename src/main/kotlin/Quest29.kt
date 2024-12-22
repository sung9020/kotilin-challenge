/*
*
* @author snow
* @since 9/7/24
*/
class Quest29 {
    fun majorityElement(nums: IntArray): Int {
        val map = hashMapOf<Int, Int>()
        var pivot = nums.size / 2

        var result = 0
        for( i in nums){
            if(map.containsKey(i)){
                map[i] = (map[i] ?: 0) + 1
            }else{
                map[i] = 1
            }
        }

        for( entry in map.entries){
            if(entry.value > pivot){
                result = entry.key
                break
            }
        }

        return result
    }

}

fun main(args :Array<String>) {
    val q = Quest29()
    println(q.majorityElement(intArrayOf(1)))
}