import Stack.*;
import Queue.*;

public class App {
    public static void main(String[] args) throws Exception {
        Queue<Integer> fila = new Queue<Integer>(4);
        fila.remove();
        System.out.println(fila);
        fila.add(2);
        System.out.println(fila);
        fila.add(3);
        System.out.println(fila);
        System.out.println(fila);
        fila.add(2);
        System.out.println(fila);
        fila.remove();
        System.out.println(fila);
        fila.remove();
        System.out.println(fila);
        fila.add(3);
        System.out.println(fila);
        fila.add(6);
        System.out.println(fila);
        fila.remove();
        System.out.println(fila);
        fila.remove();
        System.out.println(fila);
        fila.remove();
        System.out.println(fila);
        fila.remove();
        System.out.println(fila);


        
        // StaticStack<Integer> staticStack = new StaticStack<Integer>(3);
        // staticStack.push(2);
        // staticStack.push(1);
        // staticStack.push(3);
        // staticStack.push(31);
        // System.out.println(staticStack);
        // staticStack.clear();
        // System.out.println(staticStack);

        // DynamicStack<Integer> dynamicStack = new DynamicStack<Integer>();
        // dynamicStack.push(3);
        // dynamicStack.push(2);
        // dynamicStack.pop();
        // dynamicStack.push(5);
        // dynamicStack.push(1);
        // dynamicStack.push(21);
        // System.out.println(dynamicStack);
        // dynamicStack.clear();
        // System.out.println(dynamicStack);
    }    
}
