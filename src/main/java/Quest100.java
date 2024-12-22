import java.util.HashSet;

/*
 *
 * @author snow
 * @since 2021/06/20
 */
public class Quest100 {
    public static void main(String[] args) {

        String answer = solution("sanmc", "mcxxbsan");
        System.out.println(answer);
    }

    public static String solution(String s1, String s2) {
        String answer = "";

        StringBuilder answer1 = new StringBuilder();
        StringBuilder answer2 = new StringBuilder();
        int max = s1.length() + s2.length();

        for(int i = 1; i <= s1.length(); i++){
            String s1FirstGroup = s1.substring(0, i);
            String s2FirstGroup = s2.substring(s2.length() - i);

            String s1SecondGroup = s1.substring(s1.length() - i);
            String s2SecondGroup = s2.substring(0, i);

            if(s1FirstGroup.equals(s2FirstGroup)) {
                answer1.setLength(0);
                answer1.append(s2);
                answer1.append(s1.substring(i));
                if(max > answer1.length()){
                    answer = answer1.toString();
                }
            }

            if(s1SecondGroup.equals(s2SecondGroup)) {
                answer2.setLength(0);
                answer2.append(s1);
                answer2.append(s2.substring(i));
                if(max > answer2.length()){
                    answer = answer2.toString();
                }
            }
        }

        return answer;
    }
}
