import java.util.LinkedList;
import java.util.Queue;

/*
 *
 * @author snow
 * @since 2024/07/20
 */
public class Quest107 {
    public static void main(String[] args) {

        System.out.println(predictPartyVictory("RDD"));
    }

    public static String predictPartyVictory(String senate) {
        char[] array = senate.toCharArray();
        int size = array.length;

        Queue<Integer> rQueue = new LinkedList<>();
        Queue<Integer> dQueue = new LinkedList<>();

        for(int i = 0; i < size; i++){
            if(array[i] == 'R'){
                rQueue.add(i);
            }else{
                dQueue.add(i);
            }
        }

        while(!rQueue.isEmpty() && !dQueue.isEmpty()){
            int left = rQueue.poll();

            if(dQueue.isEmpty()){
                break;
            }

            int right = dQueue.poll();

            if(left > right){
                dQueue.add(right+size);
            }else {
                rQueue.add(left + size);
            }
        }

        String result = "";
        if(rQueue.isEmpty()){
            result = "Dire";
        }else{
            result= "Radiant";
        }

        return result;
    }
}
