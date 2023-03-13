package edu.mateus.loops;

import java.util.*;
/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/

public class Exe4_ParImpar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Quantidade de números: ");
        int quantNumeros = input.nextInt();

        int count = 0;
        int numero;
        int quantPares = 0, quantImpares = 0;

        do {
            System.out.println("Número: ");
            numero = input.nextInt();

            if (numero % 2 == 0) quantPares++;
            else quantImpares++;

            count++;
        } while (count < quantNumeros);

        System.out.println("Quantidade de números pares: " + quantPares);
        System.out.println("Quantidade de números impares: " + quantImpares);

        input.close();
    }
}



