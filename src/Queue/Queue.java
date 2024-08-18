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
        return res + "]" + " | top: " + this.top + " | base: " + this.base;
    }

    public void add(T data) {
        try {
            if (!this.isFull()) {
                this.dataArray[this.top] = data;
                this.top = this.move(this.top);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public int move(int position) {
        return (position + 1) % this.dataArray.length;
    }

    public T remove() {
        try {
            if (!this.isEmpty()) {
                T removed = this.dataArray[base];
                this.dataArray[base] = null;
                this.base = this.move(this.base);
                return removed;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public void clear() {
        while (this.base < this.top) {
            this.remove();
        }
        this.top = 0;
        this.base = 0;
    }

    public boolean isFull() {
        if (this.top == this.base && this.dataArray[this.top] != null) {
            throw new IllegalStateException("Ta cheio meu nobre.");
        }
        return false;
    }

    public boolean isEmpty() {
        if (this.top == this.base && this.dataArray[this.base] == null) {
            throw new IllegalStateException("Ta vazio meu nobre.");
        }
        return false;
    }
}
