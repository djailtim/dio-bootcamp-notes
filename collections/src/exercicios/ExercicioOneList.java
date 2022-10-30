package exercicios;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExercicioOneList {
    /*

        Faça um programa que receba a temperatura média dos 6
    primeiros meses do ano e armazene-as em uma lista.

    Após isto, calcule a média semestral das temperaturas e
    mostre todas as temperaturas acima desta média, e em que
    mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2
    – Fevereiro e etc).

     */
    public static void main(String[] args) {

        // Crie uma lista de temperaturas
        List<Double> temperaturas = new ArrayList<>();
        temperaturas.add(42d);
        temperaturas.add(37.5);
        temperaturas.add(40.2);
        temperaturas.add(41.5);
        temperaturas.add(39.5);
        temperaturas.add(43.0);

        System.out.println("As temperaturas declaradas foram: \n" + temperaturas);

        Iterator<Double> iterator = temperaturas.iterator();
        Double soma = 0d;
        while(iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
        Double media = soma / temperaturas.size();

        System.out.printf("\nA média das temperaturas é: %.2f%n", media);

        System.out.println("\nOs meses em que a temperatura foi maior que a média são:");
        for (int i = 0; i < temperaturas.size(); i++) {
            if (temperaturas.get(i) > media ) {
                mediaMensal(i, temperaturas.get(i));
            }
        }
    }

    public static void mediaMensal (int mes, double temperatura) {
        switch (mes) {
            case 0:
                System.out.println("1 - Janeiro: " + temperatura);
                break;
            case 1:
                System.out.println("2 - Fevereiro: " + temperatura);
                break;
            case 2:
                System.out.println("3 - Março: " + temperatura);
                break;
            case 3:
                System.out.println("4 - Abril: " + temperatura);
                break;
            case 4:
                System.out.println("5 - Maio: " + temperatura);
                break;
            case 5:
                System.out.println("6 - Junho: " + temperatura);
                break;
        }
    }
}
