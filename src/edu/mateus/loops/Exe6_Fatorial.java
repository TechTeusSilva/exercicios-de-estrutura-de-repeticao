package edu.mateus.loops;

import java.util.*;

/*
Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
Ex.: 5!= 120 (5 X 4 X 3 X 2 X 1)
*/

public class Exe6_Fatorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("\nFatorial: ");
        int fatorial = input.nextInt();

        int multiplicacao = 1;

        for (int i = fatorial ; i >= 1 ; i-- ) {
            multiplicacao *= i;
        }

        System.out.println("\n" + fatorial + "! = " + multiplicacao + "\n");

        input.close();
    }
}
