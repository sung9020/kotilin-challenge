import java.util.LinkedList;
import java.util.Queue;

/*
 *
 * @author snow
 * @since 2024/07/20
 */
public class RecentCounter {
    Queue<Integer> queue = new LinkedList<>();

    public RecentCounter() {
        queue = new LinkedList<>();
    }

    public int ping(int t) {
        queue.add(t);

        int i = 0;
        int size = queue.size();
        while(i < size){
            if(queue.isEmpty()){
                break;
            }

            int top = queue.peek();
            if(top < t - 3000 || top > t ){
                queue.poll();
            }

            i++;
        }

        return queue.size();
    }
}
