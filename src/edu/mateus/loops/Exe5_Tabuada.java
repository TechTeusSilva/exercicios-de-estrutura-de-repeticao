package edu.mateus.loops;

import java.util.*;

/*
Desenvolva um gerador de tabuada,
capar de gerar a tabuada de qualquer número inteiro entre 1 e 10.
O usuário deve informar de qual número ele deseja ver a tabuada.
A saída deve ser conforme o exemplo abaixo:

Tabuada do 5:
5 X 1 = 5
5 X 2 = 10
...
5 X 10 = 50
*/

public class Exe5_Tabuada {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\nEscolha uma tabuada: ");
        int tabuada = input.nextInt();

        System.out.println("\nTabuada do " + tabuada + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(tabuada + " X " + i + " = " + tabuada*i);
        }
        
        System.out.println("\nFIM!\n");
    }
}
