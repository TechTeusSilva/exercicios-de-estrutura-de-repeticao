package edu.mateus.arrays;

import java.util.*;

/*
Faça um programa que leia um vetor de 6 caracteres,
e diga quantas consoantes foram lidas.
Imprima as consoantes
*/

public class Exe2_Consoantes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] consoantes = new String[6];

        int quantidadeConsoantes = 0, count = 0;

        System.out.println("");
        
        do {
            System.out.println("Letra: ");
            String letra = input.next();
            
            if (!"aeiouAEIOU".contains(letra)) {
                consoantes[count] = letra;
                quantidadeConsoantes++;
            }
            count++;
        } while (count < consoantes.length);


        System.out.print("Consoantes: ");
        for (String consoante : consoantes) {
            if (consoante != null)
                System.out.print(consoante + " ");
        }

        System.out.println("Quantidade de consoantes: " + quantidadeConsoantes);
    }
}
