public class NoSpace {
    public static String noSpace(final String x) {
        /*String str = x;
        str = str.replaceAll("\\s+", "");
        return str;*/

        return x.replace(" ", "");
    }

    public static void main(String[] args) {
        String str = "He ll OO World";

        System.out.println(noSpace(str));
    }
}
