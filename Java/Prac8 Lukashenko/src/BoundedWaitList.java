public class BoundedWaitList<E> extends WaitList<E>{
    private int capacity;
    private int count = 0;
    BoundedWaitList(int capacity){
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }
    @Override
    public void add(E element) {
        if(count==capacity){
            System.out.println("Нельзя больше добавить элемент");
            return;
        }
        test.add(element);
        count++;
    }
}
