import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;

public class WaitList<E> implements IWaitList<E> {
    protected  Collection<E> c = new ConcurrentLinkedQueue<E>();
    protected ConcurrentLinkedQueue<E> test = new ConcurrentLinkedQueue<E>();
    WaitList(){};
    WaitList(Collection<E> c){
        this.c = c;
    };
    public void add(E element) {
        test.add(element);
    }

    public E remove() {
        return test.remove();
    }

    public boolean contains(E element) {
        return test.contains(element);
    }

    public boolean containsAll(Collection<E> c) {
        return test.containsAll(test);
    }

    public boolean isEmpty() {
        return test.isEmpty();
    }

    public void printelement(){
        for (E element:  test)
            System.out.println(element);
    }
    }
