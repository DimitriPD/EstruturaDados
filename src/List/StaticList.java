package List;

public class StaticList<T> {
    private T[] dataList;
    private int size;

    @SuppressWarnings("unchecked")
    public StaticList(int size) {
        this.dataList = (T[]) new Object[size];
    }

    public void clear() {

    }

    public void add(T data) {

    };
    
    public void add(T data, int pos) {
        
    };

    public T remove() {
        return null;
    }

    public boolean isEmpty() {
        return false;
    }

    public boolean isFull() {
        return false;
    }

    public void setData(T data, int pos) {

    }

    public T getData(int pos) {
        return null;
    }

    public int getSize() {
        return this.size;
    }

    public int find(T data) {
        return 0;
    }
}

 