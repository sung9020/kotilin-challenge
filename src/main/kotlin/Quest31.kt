/*
*
* @author snow
* @since 9/7/24
*/
class Quest31 {
    fun summaryRanges(nums: IntArray): List<String> {
        var i = 0
        var j = 0

        val array = arrayListOf<String>()

        if(nums.size == 1){
            array.add("${nums[0]}")
            return array
        }

        for(index in nums.indices){
            if(j == index) continue

            if(nums[j] + 1 == nums[index]){ // 조건
                j = index
                if(j == nums.size - 1){
                    array.add("${nums[i]}->${nums[j]}") // 배열이 끝나므로 여기서 종결
                }
            }else{ // 바뀌는 타이밍
                if( i == j ){ // 전혀 이동하지 않았을 경우가 있음.
                    array.add("${nums[j]}")
                }else{
                    array.add("${nums[i]}->${nums[j]}")
                }

                i = index
                j = index

                if(j == nums.size - 1){
                    array.add("${nums[j]}") // 배열이 끝나므로 여기서 종결
                }
            }
        }

        return array
    }

}

fun main(args :Array<String>) {
    val q = Quest31()
    println(q.summaryRanges(intArrayOf(-1)))
}