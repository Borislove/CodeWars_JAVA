/*Реализуйте функцию, которая преобразует заданное логическое значение в его строковое представление.

Примечание: Будут предоставлены только действительные входные данные.*/

public class BooleanToString {
    public static String convert(boolean b) {
        return b ? "true" : "false";
        //return Boolean.toString(b);


    }

    public static void main(String[] args) {

        boolean b = false;
        System.out.println(convert(b));
    }
}
