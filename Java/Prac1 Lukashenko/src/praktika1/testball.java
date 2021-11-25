package praktika1;
import java.lang.*;
public class testball {
    public static void main(String[] args){
        ball b1 = new ball ("Red",2);
        ball b2 = new ball ("Green",7);
        ball b3 = new ball ("Yellow");
        b3.setRadius(1);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        b1.intoRadius();
        b2.intoRadius();
        b3.intoRadius();
    }
}
