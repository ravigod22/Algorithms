/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.uni.countingsort;
import java.util.Random;

/**
 *
 * @author jose
 */
public class CountingSort {

    public static void main(String[] args) {
        Random rnd = new Random();
        int N = 20;
        int[] A = new int[N];
        for (int i = 0; i < N; ++i) {
            A[i] = rnd.nextInt(20415) + 1;
        }
        int[] B = CountingSort(A);
        for (int i = 0; i < N; ++i) {
            System.out.print(B[i] + (i + 1 == N ? "\n" : " "));
        }
    }
    
    public static int[] CountingSort(int[] A) {
        int limite = 0;
        for (int i = 0; i < A.length; ++i) {
            limite = Math.max(limite, A[i]); 
        }
        int[] C = new int[limite + 1];
        for (int i = 0; i < A.length; ++i) {
            C[A[i]]++;
        }
        for (int i = 1; i <= limite; ++i) {
            C[i] += C[i - 1];
        }
        int[] B = new int[A.length];
        for (int i = A.length - 1; i >= 0; --i) {
            int value = A[i];
            int pos = C[value] - 1;
            B[pos] = value;
            C[value]--;
        }
        return B;
    }
}
