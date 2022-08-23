public class MinMaxNumber {

    static public int min(int[] list) {
        int min = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[0] >= list[i]) {
                list[0] = list[i];
                min = list[0];
            }
        }
        return min;
    }

    static public int max(int[] list) {
        int max = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[0] <= list[i]) {
                list[0] = list[i];
                max = list[0];
            }
        }
        return max;
    }

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 44, 55, -1, 9, 323, 99, -990};
        int arr_1[] = {-52, 56, 30, 29, -54, 0, -110};
        //System.out.println(MinMaxNumber.min(arr));
        System.out.println(MinMaxNumber.min(arr_1));
    }
}
