/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.uni.mergesort;
import java.util.Random;

/**
 *
 * @author manuel
 */
public class MergeSort {

    public static void main(String[] args) {
        System.out.println("Algoritmo de Ordenamiento");
        Random rnd = new Random();
        int N = 20;
        int A[] = new int[N];
        for (int i = 0; i < 20; ++i) {
            A[i] = rnd.nextInt(1432) + 1;
        }
        
        // Tenemos nuestro arreglo desordenado
        System.out.println("Arreglo desordenado");
        for (int i = 0; i < N; ++i) {
            System.out.print(A[i] + (i + 1 == N ? "\n\n" : " "));
        }
        
        // Tenemos nuestro arreglo ordenado
        System.out.println("Arreglo Ordenado por Merge Sort");
        int[] B = MergeSort(A, 0, A.length - 1);

        for (int i = 0; i < N; ++i) {
            System.out.print(B[i]  + (i + 1 == N ? "\n" : " "));
        }        
    }
    
    
    public static int[] MergeSort(int A[], int l, int r) {
        if (l == r) {
            return new int[] {A[l]};
        }
        int middle = (l + r) / 2;
        int[] left = MergeSort(A, l, middle);
        int[] right = MergeSort(A, middle + 1, r);
        return Merge(left, right);  
    }
    
    public static int[] Merge(int L[], int R[]) {
        int[] A = new int[L.length + R.length];
        int ptL = 0, ptR = 0, ptA = 0;
        while (ptL < L.length && ptR < R.length) {
            if (L[ptL] <= R[ptR]) {
                A[ptA] = L[ptL];
                ptL++;
            }
            else {
                A[ptA] = R[ptR];
                ptR++;
            }
            ptA++;
        }
        while (ptL < L.length) {
            A[ptA] = L[ptL];
            ptL++;
            ptA++;
        }
        while (ptR < R.length) {
            A[ptA] = R[ptR];
            ptR++;
            ptA++;
        }
        return A;
    }
}
