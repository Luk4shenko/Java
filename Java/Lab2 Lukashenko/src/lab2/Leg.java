package lab2;
import java.util.Scanner;
public class Leg {
    private String legNumber;
    private String legHairIntensity;
    private String legLength;
    public String legInfo;

    public void LegIn() {
        Scanner in = new Scanner(System.in);
        System.out.print("Input number of legs: ");
        legNumber = in.nextLine();
        System.out.print("Input hair intensity: ");
        legHairIntensity = in.nextLine();
        System.out.print("Input leg length: ");
        legLength = in.nextLine();
    }

    public String legOut()
    {

        legInfo = "Number of legs: " + legNumber + "\nHair intensity: " + legHairIntensity + "\nLeg Length: " + legLength;

        return legInfo;
    }
}
