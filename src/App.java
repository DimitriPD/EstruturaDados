import Stack.*;

public class App {
    public static void main(String[] args) throws Exception {
        StaticStack<Integer> staticStack = new StaticStack<Integer>(3);
        staticStack.push(2);
        staticStack.push(1);
        staticStack.push(3);
        staticStack.push(31);
        System.out.println(staticStack.getDataArray());
        staticStack.clear();
        System.out.println(staticStack.getDataArray());

        DynamicStack<Integer> dynamicStack = new DynamicStack<Integer>();
        dynamicStack.push(3);
        dynamicStack.push(2);
        dynamicStack.pop();
        dynamicStack.push(5);
        dynamicStack.push(1);
        System.out.println(dynamicStack.getDataArray());
        dynamicStack.clear();
        System.out.println(dynamicStack.getDataArray());
    }    
}
