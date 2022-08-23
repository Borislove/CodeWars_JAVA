//Очень просто, учитывая целое число или число с плавающей запятой, найдите его противоположность.

/*1: -1
14: -14
-34: 34*/
public class OppositeNumber {
    public static int opposite(int number) {

        //return ~number+1;
        return Math.negateExact(number);
    }

    public static void main(String[] args) {
        System.out.println(opposite(100));
    }
}


