import java.util.LinkedList;

public class InterfaceLinkedList {
    public static void main(String[] args) {
        // Resolva usando os métodos da implementação LinkedList [7, 8.5, 9.3, 5, 7, 0, 3.6]
        System.out.println("Crie uma lista chamada notas2 " +
                "e coloque todos os elementos da list ArrayList nessa nova lista: ");
        LinkedList<Double> notas2 = new LinkedList<>();
        notas2.add(7d);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5d);
        notas2.add(7d);
        notas2.add(0.0);
        notas2.add(3.6);
        System.out.println(notas2);

        System.out.println("Mostre a primeira nota da lista sem removê-la: " + notas2.getFirst());

        System.out.println("Mostre a primeira nota da lista removendo-a: " + notas2.removeFirst());
        System.out.println(notas2);
    }
}
