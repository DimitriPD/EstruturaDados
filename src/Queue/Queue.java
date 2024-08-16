package Queue;

public class Queue<T> implements IQueue<T> {
    protected int top = 0;
    protected int base = 0;
    protected T[] dataArray;

    @SuppressWarnings("unchecked")
    public Queue(int size) {
        this.dataArray = (T[]) new Object[size];
    }

    @Override
    public String toString() {
        String res = "[ ";
        for (T data : dataArray) {
            res += data + " ";
        }
        return res + "]";
    }

    public void add(T data) {
        try {
            if (!this.isFull()) {
                this.dataArray[top] = data;
                this.top = move(this.top);
            }
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }
    }

    public int move(int topParam) {
        return topParam + 1 % this.dataArray.length;
    }

    public T remove() {
        T removed = this.dataArray[base];
        this.dataArray[base] = null;
        this.base += 1;
        return removed;
    }

    public void clear() {
        while (this.base < this.top) {
            this.remove();
        }
        this.top = 0;
        this.base = 0;
    }

    public boolean isFull() {
        if (this.top >= this.dataArray.length) {
            throw new IllegalStateException("Ta cheio meu nobre.");
        }
        return false;
    }

    public boolean isEmpty() {
        if (this.top == this.base) {
            return true;
        }
        return false;
    }
}
