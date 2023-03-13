package edu.mateus.loops;
import java.util.*;

/*
Faça um programa que leia conjuntos de dois valores,
o primeiro representando o nome do aluno e o segundo representando a sua idade.
(Pare o programa inserindo o valor 0 no campo nome)
*/

public class Exe1_Nome_Idade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Nome: ");
            String nome = input.next();
            if (nome.equals("0")) break;

            System.out.println("Idade: ");
            int idade = input.nextInt();
        }

        System.out.println("Valor inválido.");

        input.close();
    }
}
