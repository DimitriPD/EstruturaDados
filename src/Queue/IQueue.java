package Queue;

public interface IQueue<T> {
    public void add(T data);
    public T remove();
    public void clear();
    public boolean isFull();
    public boolean isEmpty();
}