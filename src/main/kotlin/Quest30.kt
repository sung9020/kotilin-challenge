import java.util.*

/*
*
* @author snow
* @since 9/7/24
*/
class Quest30 {
    fun numIslands(grid: Array<CharArray>): Int {
        var result = 0
        val xArray = intArrayOf(-1, 1, 0, 0)
        val yArray = intArrayOf(0, 0, -1, 1)

        for(x in grid.indices){
            for(y in grid[0].indices){
                val point = Pair(x, y)

                if(grid[x][y] == '1'){
                    val queue: Queue<Pair<Int, Int>> = LinkedList()
                    queue.add(point)
                    while(!queue.isEmpty()){
                        val pop = queue.poll()

                        for(index in xArray.indices){
                            val tempX = pop.first + xArray[index]
                            val tempY = pop.second + yArray[index]
                            if(tempX < 0 || tempX > grid.size - 1){
                                continue
                            }
                            if(tempY < 0 || tempY > grid[0].size -1){
                                continue
                            }

                            val value = grid[tempX][tempY]

                            if(value == '1'){
                                queue.add(tempX to tempY)
                                grid[tempX][tempY] = '0'
                            }else if(value == '0'){
                                continue
                            }
                        }
                    }
                    result += 1
                }

            }
        }
        return result
    }

}

fun main(args :Array<String>) {
    val q = Quest30()
    val grid1 = arrayOf(
        charArrayOf('1','1','1','1','0'),
        charArrayOf('1','1','0','1','0'),
        charArrayOf('1','1','0','0','0'),
        charArrayOf('0','0','0','0','0')
    )

    val grid2 = arrayOf(
        charArrayOf('1','1','0','0','0'),
        charArrayOf('1','1','0','0','0'),
        charArrayOf('0','0','1','0','0'),
        charArrayOf('0','0','0','1','1')
    )
    println(q.numIslands(grid2))
}