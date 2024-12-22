import java.util.LinkedList
import java.util.PriorityQueue

/*
*
* @author snow
* @since 9/7/24
*/
class Quest33 {
    fun maxAverageRatio(classes: Array<IntArray>, extraStudents: Int): Double {
        val priorityQueue: PriorityQueue<Pair<Pair<Int, Int>, Double>> = PriorityQueue { o1, o2 ->
            o2.second.compareTo(o1.second)
        }

        // 증가폭 큐에 넣고
        for( index in classes.indices){
            val x = classes[index][0]
            val y = classes[index][1]
            priorityQueue.add(Pair(Pair(x, y), ((x + 1).toDouble() / (y + 1)) - (x.toDouble() / y))) // +1 선반영해서 pq 넣어야함.
        }

        var repeat = 0
        while(repeat < extraStudents){
            val pop = priorityQueue.poll()
            val item = pop.first
            val x = item.first + 1
            val y = item.second + 1
            val incr = (x + 1).toDouble() / (y + 1) - (x).toDouble() / (y)
            priorityQueue.add(Pair(Pair(x, y), incr))
            repeat++
        }

        var result: Double = 0.0
        while(!priorityQueue.isEmpty()){
            val pop = priorityQueue.poll()
            val item = pop.first
            result += (item.first.toDouble() / item.second)
        }

        return result / classes.size
    }
}

fun main(args :Array<String>) {
    val q = Quest33()
    println(q.maxAverageRatio(arrayOf(intArrayOf(2,4), intArrayOf(3,9), intArrayOf(4,5), intArrayOf(2,10)),4))
}