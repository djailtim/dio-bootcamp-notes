package exercicios;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ExercicioTwoList {
    /*

        Utilizando listas, faça um programa que faça 5 perguntas para uma
    pessoa sobre um crime. As perguntas são:

    "Telefonou para a vítima?"
    "Esteve no local do crime?"
    "Mora perto da vítima?"
    "Devia para a vítima?"
    "Já trabalhou com a vítima?"

    Se a pessoa responder positivamente a 2 questões ela deve ser
    classificada como "Suspeita", entre 3 e 4 como "Cúmplice" e 5 como
    "Assassina". Caso contrário, ela será classificado como "Inocente".

     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LinkedList<String> answers = new LinkedList<>();

        List<String> questions = new ArrayList<>(){{
            add("Telefonou para a vítima?");
            add("Esteve no local do crime?");
            add("Mora perto da vítima?");
            add("Devia para a vítima?");
            add("Já trabalhou com a vítima?");
        }};

        System.out.println("---\tAnalise de Crimes - Responda as Questões (S: sim / N: não)\t---");
        for (String question: questions) {
            System.out.println(question);
            answers.add(input.nextLine());
        }

        int count = 0;
        for (String answer : answers) {
            if (answer.compareToIgnoreCase("S") == 0) count++;
        }

        if (count > 4) System.out.println("Assassino!");
        else if (count >= 3) System.out.println("Cúmplice!");
        else if (count == 2) System.out.println("Suspeito!");
        else System.out.println("Inocente!");
    }
}
