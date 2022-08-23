package StringSplit;/*Завершите решение так, чтобы оно разбило строку на пары из двух символов.
 Если строка содержит нечетное количество символов, то она должна заменить
 отсутствующий второй символ последней пары символом подчеркивания ('_').*/

//* 'abc' =>  ['ab', 'c_']
//* 'abcdef' => ['ab', 'cd', 'ef']

import java.util.Arrays;

public class StringSplit {

    public static String[] solution(String s) {
        //Write your code here
        System.out.println("String length: " + s.length());

        if (s.isEmpty()) {
            return null;
        }

        if (s.length() % 2 != 0) {
            s += "_";
        }

        char[] chars = s.toCharArray();
        System.out.print("Input data: ");
        System.out.println(Arrays.toString(chars));

        System.out.println("Chars.lenght " + chars.length); //длина

        String[] splitStrings = s.split("(?<=\\G.{2})");

        //  return new String[]{};
        return splitStrings;
    }

    public static void main(String[] args) {

        String str = "HelloWorLd1";
        System.out.println(Arrays.toString(solution(str)));
    }
}

