import java.util.*;

/*
 *
 * @author snow
 * @since 2024/07/14
 */
public class Quest104 {
    public static void main(String[] args) {
        List<String> a = new ArrayList<>();
        a.add("aba");
        a.add("abaca");
        a.add("baab");
        a.add("cba");
        System.out.println(countSimilarPairs(a));


    }
    public static long countSimilarPairs(List<String> words) {
        HashMap<String, Integer> countMap = new HashMap<>();

        long answer = 0;
        for(String word : words){
            String[] wordArray = word.split("");
            Set<String> wordSet = new HashSet<String>(Arrays.asList(wordArray));
            List<String> wordList = new ArrayList<>(wordSet);
            Collections.sort(wordList);
            String key = String.join("_", wordList);
            if(countMap.containsKey(key)){
                int sum = countMap.get(key);
                countMap.put(key, sum + 1);
            }else{
                countMap.put(key, 1);
            }
        }
        int sum = countMap.values().stream().filter(i -> i > 1).mapToInt(Integer::intValue).sum();
        answer = getCobi(sum, 2);

        return answer;
    }

    private static int getCobi(int n, int r){
        if(n == r || r == 0){
            return 1;
        }

        return getCobi(n-1, r-1) + getCobi(n-1, r);
    }

}
