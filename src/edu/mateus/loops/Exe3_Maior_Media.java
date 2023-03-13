package edu.mateus.loops;
import java.util.*;

/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
*/

public class Exe3_Maior_Media {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero;
        int maior = 0;
        int soma = 0;
        int count = 0;

        do {
            System.out.println("Número: ");
            numero = input.nextInt();
            
            soma += numero;

            if (numero > maior) maior = numero;

            count += 1;
        } while(count < 5);

        System.out.println("Média: " + soma/count);
        System.out.println("Maior: " + maior);

        input.close();
    }
}
