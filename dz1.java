/**
 * task1
 * 1. Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! 
 */
import java.util.Scanner;

public class dz1 {

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите первое число: ");
        int i = iScanner.nextInt();
        System.out.printf("Треугольное число (факториал числа): %d\n", number(i));
        iScanner.close();
    }

    public static int number(int a) {
        return (a * (a + 1)) / 2;
    }
}