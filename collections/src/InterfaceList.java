import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class InterfaceList {
    public static void main(String[] args) {
        /*
        * ‘Interface’ List serve para verificar elementos duplicados e garante ordem de inserção
        * ArrayList para mais pesquisas
        * LinkedList para inserção e exclusão
        * */

        // Dada uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6] faça:

        System.out.println("Crie uma lista e adicione as sete notas: ");
        List<Double> notas = new ArrayList<>();
        notas.add(7d); // Método add adiciona elementos no vetor
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5d);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);
        System.out.println(notas);
        System.out.println(notas.toString()); // Para imprimir na tela pode usar o toString ou não

        System.out.println("Exiba a posição da nota 5.0: " + notas.indexOf(5d)); // Traz o índice do valor procurado

        System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
        notas.add(4, 8.0); // No método add podemos usar dois argumentos, o primeiro é o índice e segundo é o novo valor
        System.out.println(notas);

        System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
        notas.set(notas.indexOf(5d), 6d); // Método ‘set’ serve para atualizar um valor, no primeiro argumento coloca-se o índice e no segundo o novo valor
        System.out.println(notas);

        System.out.println("Confira se a nota 5.0 está na lista: " + notas.contains(5d)); // Método contém pesquisa no vetor se há valor procurado
        
        /*
        System.out.println("Exiba todas as notas na ordem em que foram informados: ");
        for (Double nota : notas) System.out.println(nota); // ForEach para imprimir um valor por vez
        */
        
        System.out.println("Exiba a terceira nota adicionada: " + notas.get(2)); // Traz o terceiro item do array
        System.out.println("Exiba a menor nota: " + Collections.min(notas)); // Traz o menor valor do array
        System.out.println("Exiba a maior nota: " + Collections.max(notas)); // Traz o maior valor do array

        System.out.println("Exiba a soma dos valores: ");
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while (iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
        System.out.println(soma);

        System.out.println("Exiba a média das notas: " + (soma/notas.size())); // Calcula a média com o método size()

        System.out.println("Remova a nota 0: ");
        notas.remove(0d); // Método utilizado para remover um valor do array
        System.out.println(notas);

        System.out.println("Remova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator(); // Iterar pelo array removendo itens menores que 7
        while(iterator1.hasNext()) {
            Double next = iterator1.next();
            if (next < 7) iterator1.remove();
        }
        System.out.println(notas);

        System.out.println("Apague toda a lista: ");
        notas.clear();

        System.out.println("Confira se a lista está vazia: ");
        notas.isEmpty();

    }
}
