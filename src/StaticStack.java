public class StaticStack<T> extends ArrayStack<T>{

    public StaticStack(int size) {
        super(size);
    }

    @Override
    public void push(T data) {
        try {
            if (!this.isFull()) {
                this.dataArray[top] = data;
                this.top += 1;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public boolean isFull() {
        if (this.top >= this.size) {
            throw new ArrayIndexOutOfBoundsException("Array is full;");
        } 
        return false;
    }

}
