package Stack;

public interface IArrayStack<T> {
    public void push(T data);
    public T pop();
    public void clear();
    public boolean isEmpty();
}
