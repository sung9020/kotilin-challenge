import java.util.*

/*
*
* @author snow
* @since 9/7/24
*/
class Quest35 {
    fun snakesAndLadders(board: Array<IntArray>): Int {
        var result = -1
        val xSize = board.size
        val ySize = board[0].size
        val queue: Queue<IntArray> = LinkedList()
        queue.add(intArrayOf(1,0))
        val set: MutableSet<Int> = mutableSetOf()
        set.add(1)

        while(queue.isNotEmpty()){
            val curr = queue.poll()

            for( i in 1..6){
                var next = curr[0] + i
                val nextPair = getPair(next, board.size)
                val nextX = nextPair.first
                val nextY = nextPair.second

                val number = board[nextX][nextY]
                if(number > -1){
                    next = number // 주사위 1개로 포지션 한번에 점프
                }
                if(next == board.size * board.size) {
                    return curr[1] + 1
                }

                if(!set.contains(next)){ // 이미 방문 한곳을 스킵해야 무한 루프를 돌지 않는다. bfs
                    set.add(next)
                    queue.add(intArrayOf(next, curr[1] + 1)) // 다음칸으로 가면서 주사위 +1
                }
            }

        }

        return result
    }

    private fun getPair(num: Int, size: Int): Pair<Int, Int>{
        val realNumber = num - 1
        val x = (realNumber / size)
        val y = (realNumber % size)
        return if(x % 2 == 0){
            Pair(size - x - 1, y)
        }else{
            Pair(size - x - 1, size - 1 - y)
        }
    }
}



fun main(args :Array<String>) {
    val q = Quest35()
    val board = arrayOf(
        intArrayOf(-1,-1,-1,-1,-1,-1),
        intArrayOf(-1,-1,-1,-1,-1,-1),
        intArrayOf(-1,-1,-1,-1,-1,-1),
        intArrayOf(-1,35,-1,-1,13,-1),
        intArrayOf(-1,-1,-1,-1,-1,-1),
        intArrayOf(-1,15,-1,-1,-1,-1)
    )

    val board2 = arrayOf(
        intArrayOf(-1,-1),
        intArrayOf(-1,3)
    )
    println(q.snakesAndLadders(board))
}