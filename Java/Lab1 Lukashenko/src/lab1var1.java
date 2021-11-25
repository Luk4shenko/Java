import java.util.Scanner;
public class lab1var1 {
    public static void main(String[] args) {
        int[] mas = new int[]{1, 3, 6, 8};
        Scanner sc = new Scanner(System.in);
        first(mas);
        for (int i = 0; i < args.length; i++) {
            System.out.print(args[i]);
        }
    }

    public static void first(int[] mas) {
        int ans = 0, j = 0, k = 0;
        for (int i = 0; i < mas.length; i++) {
            ans += mas[i];
        }
        System.out.print(ans);
        System.out.print('\n');
        ans = 0;
        while (j < mas.length) {
            ans += mas[j];
            j++;
        }
        System.out.print(ans);
        System.out.print('\n');
        ans = 0;
        do {
            ans += mas[k];
            k++;
        } while (k < mas.length);
        System.out.print(ans);
        System.out.print('\n');
    }
}