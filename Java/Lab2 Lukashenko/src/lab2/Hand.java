package lab2;
import java.util.Scanner;
public class Hand {
    private String Tattoo;
    private String Manicure;
    private String Beauty;
    public String handInfo;

    public void HandIn() {
        Scanner in = new Scanner(System.in);
        System.out.print("Has tattoo? ");
        Tattoo = in.nextLine();
        System.out.print("Has Manicure?: ");
        Manicure = in.nextLine();
        System.out.print("Please, rate the beauty of the hand: ");
        Beauty = in.nextLine();
    }

    public String handOut()
    {

        handInfo = "Any Tattoo?: " + Tattoo + "\nHas manicure?: " + Manicure + "\nYou rating on this hand: " + Beauty;

        return handInfo;
    }
}
