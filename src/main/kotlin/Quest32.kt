/*
*
* @author snow
* @since 9/7/24
*/
class Quest32 {
    fun rotate(nums: IntArray, k: Int): Unit {
        var copy = nums.copyOf()

        for( i in nums.indices){
            val point = (i + k) % nums.size
            nums[point] = copy[i]
        }
    }

}

fun main(args :Array<String>) {
    val q = Quest32()
    val nums = intArrayOf(1,2)
    q.rotate(nums, 3)
    println(nums.joinToString(","))
}