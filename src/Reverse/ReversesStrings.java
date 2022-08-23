package Reverse;


//Завершите решение так, чтобы оно перевернуло переданную в него строку.
public class ReversesStrings {

    public static String solution(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(solution("HelloWord"));
    }
}