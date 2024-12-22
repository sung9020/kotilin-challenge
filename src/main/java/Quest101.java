/*
 *
 * @author snow
 * @since 2021/06/20
 */
public class Quest101 {
    public static void main(String[] args) {


    }

    public int[] solution(int[] grade) {
        int[] answer = {};
        int count = 0;
        int[] rank = new int[grade.length];
        for(int i = 0; i < grade.length; i++){
            count = 0;
            for(int j = 0; j <grade.length; j++){
                if(grade[i] < grade[j]) count++;
            }
            rank[i] = count + 1;
        }
        answer = rank;
        return answer;
    }
}

