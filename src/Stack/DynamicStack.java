package Stack;

public class DynamicStack<T> extends ArrayStack<T>{
    public DynamicStack() {
        super(1);
    }

    @Override
    public String toString() {
        String dataArrayReturn = "[ ";
        for (T data : this.dataArray) {
            if (data != null) {
                dataArrayReturn += data + " ";
            }
        }
        return dataArrayReturn + "]";
    }

    @SuppressWarnings("unchecked")
    @Override
    public void push(T data) {
        if (this.top == this.size - 1) {
            T[] copy = this.dataArray.clone();
            this.size *= 2;
            this.dataArray = (T[]) new Object[this.size];

            for (int i = 0; i < copy.length; i++) {
                this.dataArray[i] = copy[i];                
            }
        }
        this.dataArray[top] = data;
        top += 1;
    }
    
}
