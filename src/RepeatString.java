import java.util.ArrayList;
import java.util.Collections;

// X_X

public class RepeatString {

    public static String repeatStr(final int repeat, final String string) {
/*
        String str = " ";

        for (int i = 0; i < repeat; i++) {
            str = str.concat(string);
        }
        return str;*/

        return string.repeat(repeat);
    }
/*
    public static String repeatStr1(final int repeat, final String string) {

        String str = string;

        for (int i = 0; i < repeat; i++) {
            str += string;
        }
        return str;
    }

    static int anInt = 0;

    public static long test() {
        long start = System.nanoTime();
     //  repeatStr(100, "HelloWorld");
       repeatStr1(100, "HelloWorld");

        long finish = System.nanoTime();
        long elapsed = finish - start;
        anInt = (int) elapsed;
        arrayList.add(anInt);
        System.out.println("Прошло времени, мс: " + elapsed);

        return elapsed;
    }

    public static int needInt() {
        return anInt;
    }

    static ArrayList arrayList = new ArrayList();*/

    public static void main(String[] args) {
      //  String str = "HelloWorld";
        String str = "Lorem ipsum dolor sit amet, consectetur adipiscing elit." +
                " Curabitur fermentum velit nec egestas accumsan. Sed iaculis," +
                " odio id venenatis vestibulum, nulla ante gravida orci, a consectetur" +
                " ante justo vel justo. Aliquam tincidunt mattis tellus, id scelerisque nulla" +
                " porttitor vitae. Pellentesque mollis sagittis est, nec maximus tellus maximus scelerisque." +
                " Proin blandit luctus odio a interdum. Aliquam faucibus pharetra ultrices. Aliquam ut pretium ligula" +
                ", venenatis scelerisque sapien. Aliquam luctus lorem augue, eget rutrum ipsum blandit et. Phasellus pretium " +
                "lacus semper, faucibus risus quis, consequat justo. Nam tempus nibh eu nisl aliquet, ac vehicula nisl pretium.\n" +
                "\n" +
                "Etiam ut nisi quam. Vestibulum maximus viverra dolor, ut fringilla lacus aliquam et. Quisque vel aliquam enim," +
                " id tincidunt enim. Aenean mattis placerat felis, sit amet tincidunt ante accumsan at. Integer pharetra elit fringilla," +
                " ultrices mi et, consequat elit. Morbi ac arcu at orci tincidunt imperdiet. Vivamus in diam aliquam, semper est a, vehicula " +
                "turpis. Mauris tempus a turpis sed molestie.";

      /*  for (int i = 0; i < 1000; i++) {
            System.out.println(test());
        }

        System.out.println("anInt " + anInt);

        //System.out.println(arrayList);
        System.out.print("min: ");
        System.out.println(Collections.min(arrayList));
        System.out.print("max: ");
        System.out.println(Collections.max(arrayList));*/

        System.out.println(repeatStr(5, "hello"));
    }
}


    //String str = "HelloWorld";
//concat
/*min: 10100
max: 2105500*/

/*min: 9400
max: 2024100
*/

/*min: 8600
max: 2081300*/

// add ///////////////////////////
/*min: 10600
max: 4945600
*/
/*min: 10800
max: 5150000*/

/*min: 9800
max: 4589400*/


//String str = "FISH"

/*min: 8600
max: 2247500*/

/*min: 9300
max: 2071700*/

/*min: 9100
max: 2066500*/

