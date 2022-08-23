package StringSplit;

import java.util.Arrays;

public class StringSplitTest {
    public static void main(String[] args) {

        String str = "HelloWorLd1";
        System.out.println("str.lenght = "+str.length());

        char[] chars = str.toCharArray();
        System.out.println(Arrays.toString(chars));

        String [] splitStrings = str.split("(?<=\\G.{2})");
        System.out.println(Arrays.toString(splitStrings));

        if(str.length() %2 != 0){
            str +="_";
        }
        System.out.println(str);
    }
}
