import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class InterfaceLinkedHashSetTreeSet {
    public static void main(String[] args) {
        System.out.println("Exiba todas as notas na ordem em que foram informados: "); // Com HashSet não é possível obter ordem de inserção, tem que usar LinkedHashSet
        Set<Double> notas1 = new LinkedHashSet<>();
        notas1.add(7d);
        notas1.add(8.5);
        notas1.add(9.3);
        notas1.add(5d);
        notas1.add(7d);
        notas1.add(0d);
        notas1.add(3.6);
        System.out.println(notas1);

        System.out.println("Exiba todas as notas na ordem crescente: "); // Necessário utilizar o TreeSet
        Set<Double> notas2 = new TreeSet<>(notas1); // Só é possível inserir o conjunto notas1 porque ela tem na classe o comparable
        System.out.println(notas2);

        System.out.println("Apague toda o conjunto: ");
        notas1.clear();

        System.out.println("Confira se o conjunto está vazia: " + notas1.isEmpty());
    }
}
