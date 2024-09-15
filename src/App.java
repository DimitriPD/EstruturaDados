import Arvore.Arvore;

public class App {
    public static void main(String[] args) throws Exception {
        Arvore<Integer> arvore = new Arvore<Integer>();

        arvore.add(10);
        arvore.add(8);
        arvore.add(5);
        arvore.add(9);
        arvore.add(7);
        arvore.add(18);
        arvore.add(13);
        arvore.add(20);
        arvore.InOrder(arvore.getRoot());
    }    
}
