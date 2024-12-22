/*
*
* @author snow
* @since 9/7/24
*/
class Quest25 {

    fun findMaxAverage(nums: IntArray, k: Int): Double {
        var window = 0
        var max: Double = Int.MIN_VALUE.toDouble()
        for(i in 0 until k){
            window += nums[i] // 윈도우를 전부 더하고
        }

        max = kotlin.math.max(max, window.toDouble() / k)
        // 4 = 0 [1 2 3 4]    4 - k
        var index = k

        while(index < nums.size){
            window += nums[index]
            window -= nums[index-k]

            max = kotlin.math.max(max, window.toDouble() / k)
            index++
        }

        return max
    }
}

fun main(args :Array<String>) {
    val q = Quest25()
    println(q.findMaxAverage(intArrayOf(493,593,1446,-6013,2163,8450,3008,-1328,6195,4102,-6242,-9971,-8327,4480,-4972,-8305,-1644,2320,331,2465,2955,-8386,-7580,1759,-9576,-8088,-9446,-2916,-3600,923,1412,-5390,4492,9458,-9336,-4754,-3455,9597,-324,-5628,4242,4076,8159,-2423,-3449,6744,9029,-9231,2283,6118,-200,3610,-7566,-6976,2519,9532,2221,-5167,-2370,1861,-1558,-9815,-1186,2021,7050,-4504,4926,8362,7805,-8274,-351,5826,7623,-5520,-2395,-8466,-8461,3261,-3197), 7))
}