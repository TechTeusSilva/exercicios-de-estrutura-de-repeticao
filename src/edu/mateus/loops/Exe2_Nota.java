package edu.mateus.loops;
import java.util.*;

/*
Faça um programa que peça uma nota, entre zero e dez.
Mostre uma mensagem caso o valor seja inválido
e continue pedindo 
até que o usuário informe um valor válido.
*/

public class Exe2_Nota {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Nota: ");
        int nota = input.nextInt();

        while (nota < 0 || nota > 10) {
            System.out.println("Nota inválida! Digite novamente: ");
            nota = input.nextInt();
        }

        System.out.println("Nota Válida! Programa encerrado.");

        input.close();
        
    }
}
