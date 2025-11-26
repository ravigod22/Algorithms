/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.uni.insertionsort;
import java.util.Random;
/**
 *
 * @author jose
 */
public class InsertionSort {

    public static void main(String[] args) {
        Random rnd = new Random();
        int N = 20;
        int[] A = new int[N];
        for (int i = 0; i < N; ++i) {
            A[i] = rnd.nextInt(20415) + 1;
        }
        InsertionSort(A);
        for (int i = 0; i < N; ++i) {
            System.out.print(A[i] + (i + 1 == N ? "\n" : " "));
        }
        
    }
    
    public static void InsertionSort(int[] A) {
        int len = A.length;
        for (int i = 1; i < len; ++i) {
            int key = A[i];
            int j = i - 1;
            
            while (j >= 0 && A[j] > key) {
                A[j + 1] = A[j];
                j--;
            }
            A[j + 1] = key;
        }
    }
}
