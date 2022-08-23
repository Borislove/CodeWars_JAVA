/*Напишите функцию для преобразования имени в инициалы. Это ката строго состоит из двух слов с одним пробелом между ними.

Выходные данные должны состоять из двух заглавных букв с разделяющей их точкой.

Это должно выглядеть примерно так:

Сэм Харрис => S.H

патрик Фини => P.F*/

public class AbbreviateTwoWords {

    public static String abbrevName(String name) {

        char[] chars = name.toCharArray();

        Character ch = ' ';
        StringBuilder string = new StringBuilder(String.valueOf(ch));

        for (int i = 0; i < chars.length; i++) {

            if (i == 0) {
                string.append(chars[0]);
                string.append(".");
            }

            if (chars[i] == ' ') {
                i++;
                string.append(chars[i]);
            }
        }

        string = new StringBuilder(string.toString().toUpperCase());

        String test = String.valueOf(string).trim();

        return test;
    }

    public static void main(String[] args) {

        System.out.println(abbrevName("cBart Simpson"));

               /* String c = "IceCream";
        String upper = c.toUpperCase();
        System.out.println(upper);*/

    }
}
