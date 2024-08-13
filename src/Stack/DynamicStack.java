package Stack;

public class DynamicStack<T> extends ArrayStack<T>{
    public DynamicStack() {
        super(1);
    }

    @SuppressWarnings("unchecked")
    @Override
    public void push(T data) {
        if (this.top == this.size - 1) {
            T[] copy = this.dataArray.clone();
            this.size *= 1.5;
            this.dataArray = (T[]) new Object[this.size];

            for (int i = 0; i < copy.length; i++) {
                this.dataArray[i] = copy[i];                
            }
        }
        this.dataArray[top] = data;
        top += 1;
    }
    
}
