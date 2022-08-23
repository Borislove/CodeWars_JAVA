/*Реализуйте функцию, которая принимает 3 целых значения a, b, c. Функция должна возвращать true,
 если треугольник может быть построен со сторонами заданной длины, и false в любом другом случае.

(В этом случае все треугольники должны иметь поверхность больше 0, чтобы быть принятыми).*/
public class TriangleTester {

    public static boolean isTriangle(int a, int b, int c) {

        if ((a > 0 || b > 0 || c > 0)) {
            return false;
        }

        return b + c > a && a + c > b && a + b > c;
    }

    public static void main(String[] args) {
        System.out.println(isTriangle(10, 10, 20));
    }
}
