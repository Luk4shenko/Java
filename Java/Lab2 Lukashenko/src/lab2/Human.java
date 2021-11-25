package lab2;

import java.util.Scanner;

public class Human {
    public static void main(String[] a)
    {
        String Name;
        String Age;
        int menu;

        Scanner in = new Scanner(System.in);
        System.out.print("Input name: ");
        Name = in.nextLine();
        System.out.print("Input age: ");
        Age = in.nextLine();

        for (int i = 1; ;)
        {
            System.out.print("\nЧто изменить?\n");
            System.out.print("Голова - 1\n" + "Нога - 2\n" + "Рука - 3\n" + "Выйти - 0\n");


            menu = in.nextInt();
            switch (menu)
            {
                case  (1):
                    Head head = new Head();
                    head.HeadIn();
                    System.out.print(head.headOut());
                    break;
                case (2):
                    Leg leg = new Leg();
                    leg.LegIn();
                    System.out.print(leg.legOut());
                    break;

                case (3):
                    Hand hand = new Hand();
                    hand.HandIn();
                    System.out.print(hand.handOut());
                    break;
                case (0):
                    System.exit(0);

            }

        }
    }
}
