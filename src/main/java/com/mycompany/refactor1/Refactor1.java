/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.refactor1;

import java.util.Arrays;

/**
 *
 * @author fernanda.nunes
 */
public class Refactor1 {

    public static void main(String[] args) {
        int[] vet1 = {10, 7, 6, 67, 100};
        int[] vet2 = {89, 76, 70};

        // Encontrar e imprimir o maior elemento de vet1
        int maiorVet1 = encontrarMaiorElemento(vet1);
        System.out.println("Maior elemento do vetor 1: " + maiorVet1);

        // Encontrar e imprimir o maior elemento de vet2
        int maiorVet2 = encontrarMaiorElemento(vet2);
        System.out.println("Maior elemento do vetor 2: " + maiorVet2);

        // Pesquisar um elemento em vet1
        int elementoPesquisar = 2;        
        if (pesquisar(elementoPesquisar, vet1) == true) {
            System.out.println("O elemento " + elementoPesquisar + " está presente no vetor 1");
        } else{
            System.out.println("O elemento " + elementoPesquisar + " não está presente no vetor 1");
        }
        
    }

    public static int encontrarMaiorElemento(int[] vetor) {
        Arrays.sort(vetor);
        return vetor[vetor.length - 1];
    }

    public static boolean pesquisar(int elemento, int[] vetor) {
        for (int num : vetor) {
            if (num == elemento) {
                return true;
            }
        }
        return false;
    }
}
