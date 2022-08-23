/*[true,  true,  true,  false,
  true,  true,  true,  true ,
  true,  false, true,  false,
  true,  false, false, true ,
  true,  true,  true,  true ,
  false, false, true,  true]
*/

import java.util.Arrays;

public class CountingSheep {

    public static int countSheeps(Boolean[] arrayOfSheeps) {

        if (arrayOfSheeps == null ) {
            return 0;
        }

        int count = 0;
        if (arrayOfSheeps.length != 0) {
            for (int i = 0; i < arrayOfSheeps.length; i++) {
                if (arrayOfSheeps[i])
                    count++;

                if (arrayOfSheeps[i] == null) {
                    i++;
                    continue;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {

        Boolean b[] = {true, true, true, false,
                true, true, true, true,
                true, false, true, false,
                true, false, false, true,
                true, true, true, true,
                null, false, true, true};

        //  Boolean b[] = {};

        System.out.println(Arrays.toString(b));

        System.out.println(CountingSheep.countSheeps(b));
    }
}
