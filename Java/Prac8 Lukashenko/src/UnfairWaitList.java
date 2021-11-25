import java.util.Collection;

public class UnfairWaitList<E> extends WaitList<E> {

    public void remove(E element) {
        test.remove(element);
        c.add(element);
    }
    @Override
    public void add(E element) {
        if (c.contains(element)){
            System.out.println("Такой элемент уже был удален");
            return;
        }
        else{
        test.add(element);
        System.out.println("Элемент добавлен");
    }}

}
