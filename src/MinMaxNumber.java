public class MinMaxNumber {
/*

    static public int minValue(int[] list) {
        int minValue = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[0] >= list[i]) {
                list[0] = list[i];
                minValue = list[0];
            }
        }
        return minValue;
    }

    static public int maxValue(int[] list) {
        int maxValue = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[0] <= list[i]) {
                list[0] = list[i];
                maxValue = list[0];
            }
        }
        return maxValue;
    }
*/


///////////////   ///////////////////////////

   /* protected final int = "";
    protected  final  int = " "*/

    private static int minValue = 0;
    private static int maxValue = 0;

    private int getMinValue() {
        return minValue;
    }

    private void setMinValue(int minValue) {
        MinMaxNumber.minValue = minValue;
    }

    private int getMaxValue() {
        return maxValue;
    }

    private void setMaxValue(int maxValue) {
        MinMaxNumber.maxValue = maxValue;
    }

   final private int sorted(int[] list) {
        MinMaxNumber m = new MinMaxNumber();
        java.util.Arrays.sort(list);

        for (int i = 0; i < list.length; i++) {
            m.setMinValue(list[0]);
            m.setMaxValue(list[list.length - 1]);
        }

        if (minValue < maxValue)
            return m.getMinValue();

        return m.getMaxValue();
    }

    public int min(int[] list) {
        sorted(list);
        return getMinValue();
    }

    public int max(int[] list) {
        sorted(list);
        return getMaxValue();
    }

    public static void main(String[] args) {

      //  int arr[] = {1, 2, 3, 44, 55, -1, 9, 323, 99, -990};
        int arr_1[] = {-52, 56, 30, 29, -54, 0, -110};
        //System.out.println(MinMaxNumber.minValue(arr));
        //  System.out.println(MinMaxNumber.minValue(arr_1));

        MinMaxNumber m = new MinMaxNumber();
      //  System.out.println(m.sorted(arr_1));

       /* System.out.println(m.getMinValue());
        System.out.println(m.getMaxValue());*/

        System.out.println(m.min(arr_1));
        System.out.println(m.max(arr_1));
    }
}
