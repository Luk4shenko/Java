import java.util.Scanner;

public class MainClass {
    public static int task10(int n, int i) {
        return (n == 0) ? i : task10(n / 10, i * 10 + n % 10);
    }


    public static String task14(int n) {

        if (n < 10)
            return Integer.toString(n);
        else
            return task14(n / 10) + " " + n % 10;
    }

    public static int task15(int n) {
        if (n < 10)
            return n;
        else {
            System.out.print(n % 10 + " ");
            return task15(n / 10);
        }
    }

    public static void main(String[] args) {

        System.out.println("Разворот числа");
        System.out.println(task10(234, 0));

        System.out.println(" Цифры числа слева направо");
        System.out.println(task14(421));

        System.out.println("Цифры числа справа налево");
        System.out.println(task15(123));


    }
}
