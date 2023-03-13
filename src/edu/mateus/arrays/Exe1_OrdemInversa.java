package edu.mateus.arrays;

import java.util.Arrays;

/*
Crie um vetor de 6 números inteiros
e mostre-os na ordem inversa.
*/

public class Exe1_OrdemInversa {
    public static void main(String[] args) {
        
        int[] vetor = {7, -5, 15, 50, 8, -100};
        System.out.println("\n Vetor Original:\n" + Arrays.toString(vetor));

        System.out.print("\nVetor Invertido:\n");
        for (int i = (vetor.length - 1) ; i >= 0 ; i-- ) {
            System.out.print(vetor[i] + " ");
        }

        System.out.println("\n");
    }
}
