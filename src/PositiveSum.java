//Example [1,-4,7,12] => 1 + 7 + 12 = 20

public class PositiveSum {

    public static int sum(int[] arr) {

        int sum = 0;

        if (arr.length != 0) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > 0) {
                    sum += arr[i];
                }
            }
        }

        return sum;

        // return Arrays.stream(arr).filter(v -> v > 0).sum();  O_O
    }

    public static void main(String[] args) {

        int a[] = {-1, -4, -7, -12};

        System.out.println(sum(a));
    }
}
