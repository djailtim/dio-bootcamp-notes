import java.util.*;

public class InterfaceSet {
    public static void main(String[] args) {
        /*

            A ‘interface’ ‘set’ não permite elementos duplicados e não possui índice.
            TreeSet serve para ordenação.
            HashSet não mantém a ordem dos elementos, enquanto LinkedHashSet e TreeSet mantém.

         */

        // Dada uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6] faça:

        System.out.println("Crie um conjunto e adicione as notas: ");
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        System.out.println(notas);

//        System.out.println("Exiba a posição da nota 5.0: "); // Não há como pesquisar posições, dado que hashset não tem index
//        System.out.println("Adicione na lista a nota 8.0 na posição 4: "); // Não há como pesquisar posições, dado que hashset não tem index
//        System.out.println("Substitua a nota 5.0 pela nota 6.0: "); // Não há como pesquisar posições, dado que hashset não tem index

        System.out.println("Confira se a nota 5.0 está na lista: " + notas.contains(5d));

//        System.out.println("Exiba a terceira nota adicionada: "); // Não há como pesquisar posições, dado que hashset não tem index

        System.out.println("Exiba a menor nota: " + Collections.min(notas));
        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        System.out.println("Exiba a soma dos valores: ");
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while (iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
        System.out.println(soma);

        System.out.println("Exiba a média das notas: " + (soma/notas.size()));
        System.out.println("Remova a nota 0: ");
        notas.remove(0d);
        System.out.println(notas);

        System.out.println("Remova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()) {
            Double next = iterator1.next();
            if (next < 7) iterator1.remove();
        }
        System.out.println(notas);
    }

}
