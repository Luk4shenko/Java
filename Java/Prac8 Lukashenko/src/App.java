import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;

public class App {
    public static void main(String[] args) {

        UnfairWaitList<Integer> ab = new UnfairWaitList<Integer>();
        ab.add(5);
        ab.remove(5);
        ab.add(5);
        ab.add(88);
        ab.printelement();
    }
}