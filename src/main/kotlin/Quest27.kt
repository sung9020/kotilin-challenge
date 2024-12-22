/*
*
* @author snow
* @since 9/7/24
*/
class Quest27 {
    fun longestOnes(nums: IntArray, k: Int): Int {
        var start = 0

        var kCounter = 0
        var max = Int.MIN_VALUE

        for(end in nums.indices){
            if(nums[end] == 0) kCounter += 1

            while(kCounter > k){ // 더이상 뒤집을수 없음
                if(nums[start] == 0){
                    kCounter -= 1 // 왼쪽에서 0에 닿아서 오른쪽 0을 없애고
                }
                start++
            }

            max = Math.max(max, end - start + 1)
        }

        return max
    }
}

fun main(args :Array<String>) {
    val q = Quest27()
    println(q.longestOnes(intArrayOf(1,1,1,0,0,0,1,1,1,1,0),2))
}