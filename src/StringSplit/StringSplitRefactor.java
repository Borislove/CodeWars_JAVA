package StringSplit;

import java.util.Arrays;

public class StringSplitRefactor {

    public static String[] solution(String s) {
        //Write your code here
        if (s.length() % 2 != 0) {
            s += "_";
        }
        return s.split("(?<=\\G.{2})");
    }

    public static void main(String[] args) {

        String str = "HelloWorLd1";
        System.out.println(Arrays.toString(solution(str)));
    }
}

