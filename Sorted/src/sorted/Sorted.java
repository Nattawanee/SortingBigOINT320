/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorted;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author int320
 */
public class Sorted {
    private static int N = 300_000;
    private static Random r = new Random();
    
    public static void main(String[] args) {
        Integer[] a1= new Integer[N];
        Integer[] a2= new Integer[N];
        Integer[] a3= new Integer[N];
        initial(a1);
        System.arraycopy(a1, 0, a2, 0, a1.length);
        System.arraycopy(a1, 0, a3, 0, a1.length);
        System.out.println("Arrays.sort");
        long begin = System.currentTimeMillis();
        
        Arrays.sort(a1);
        
        System.out.println("Duration" + (System.currentTimeMillis()-begin)+ "milliseconds");
        
        System.out.println("Normal Sort");
        
        long beginN = System.currentTimeMillis();
        
        Sorted.Sort(a2);
        
//        for(int i : a2){
//            System.out.printf(i + "\n");
//        }
        System.out.println("Duration" + (System.currentTimeMillis()-beginN)+ "milliseconds");
    }

    private static void initial(Integer[] a1) {
        for(int i = 0; i < a1.length; i++){
            a1[i] = r.nextInt(N);
        }
    }
    
    public static void Sort(Integer[] array){
        for (int j = 1; j < N; j++) {  
            Integer key = array[j];  
            int i = j-1;  
            while ( (i > -1) && ( array [i] > key ) ) {  
                array [i+1] = array [i];  
                i--;  
            }  
            array[i+1] = key;  
        }  
    }
}
