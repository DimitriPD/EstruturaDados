package Stack;

public abstract class ArrayStack<T> implements IArrayStack<T> {
    protected int top = 0;
    protected T[] dataArray;
    protected int size;
    
    @SuppressWarnings("unchecked")
    public ArrayStack(int size) {
        this.dataArray = (T[]) new Object[size];
        this.size = size;
    }

    public String getDataArray() {
        String dataArrayReturn = "[ ";
        for (T data : this.dataArray) {
            if (data != null) {
                dataArrayReturn += data + " ";
            }
        }
        return dataArrayReturn + "]";
    }

    @Override
    public void push(T data) {
        System.out.println("Method not implemented yet;");
    }

    @Override
    public T pop() {
        this.top -= 1;
        T deleted = this.dataArray[top];
        this.dataArray[top] = null;
        return deleted;
    }

    @Override
    public void clear() {
        int addedItens = top;
        for (int i = 0; i < addedItens; i++) {
            this.pop();
        }
    }

    @Override
    public boolean isEmpty() {
        if (this.top <= 0) {
            return true;
        }
        return false;
    }
}
