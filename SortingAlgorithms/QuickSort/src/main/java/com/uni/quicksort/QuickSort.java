/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.uni.quicksort;
import java.util.Random;
/**
 *
 * @author jose
 */
public class QuickSort {
    public static void main(String[] args) {
        Random rnd = new Random();
        int N = 20;
        int[] A = new int[N];
        for (int i = 0; i < N; ++i) {
            A[i] = rnd.nextInt(3125) + 1;
        }
        QuickSort(A, 0, A.length - 1, rnd);
        for (int i = 0; i < N; ++i) {
            System.out.print(A[i] + (i + 1 == N ? "\n" : " "));
        }
    }
    
    // En el mejor de los casos O(NlogN)
    public static void QuickSort(int[] A, int l, int r, Random rnd) {
        if (l >= r) return;
        int pivot = l + rnd.nextInt(r - l + 1);
        int aux = A[pivot];
        A[pivot] = A[r];
        A[r] = aux;
        
        int P = Partition(A, l, r);
        
        QuickSort(A, l, P - 1, rnd);
        QuickSort(A, P + 1, r, rnd);
        
    }
    
    public static int Partition(int[] A, int l, int r) {
        int pivot = A[r];
        int i = l - 1;
        for (int j = l; j < r; ++j) {
            if (A[j] <= pivot) {
                i++;
                int aux = A[i];
                A[i] = A[j];
                A[j] = aux;
            }
        }
        int aux = A[i + 1];
        A[i + 1] = A[r];
        A[r] = aux;
        return i + 1;
    }
    
}
