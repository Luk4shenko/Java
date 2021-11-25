package lab2;
import java.util.Scanner;
public class Head {
    private String eyeColour;
    private String hairType;
    private String hairColour;
    public String headInfo;

    public void HeadIn() {
        Scanner in = new Scanner(System.in);
        System.out.print("Input eye colour: ");
        eyeColour = in.nextLine();
        System.out.print("Input hair type: ");
        hairType = in.nextLine();
        System.out.print("Input hair colour: ");
        hairColour = in.nextLine();
    }

    public String headOut()
    {
        headInfo = "Eye colour: " + eyeColour + "\nHair type: " + hairType + "\nHair Colour: " + hairColour;
        return headInfo;

    }
}
