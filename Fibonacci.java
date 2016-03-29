/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

import java.util.Scanner;

/**
 *
 * @author Praktikum
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner (System.in);
        int a, b;
        System.out.println("Input: ");
        a=sc.nextInt();
        System.out.println("Output : ");
        for (int i = 1; i <= a; i++) {
            System.out.println(angkafibo(i)+" ");
            
        }
        
    }
    
    public static int angkafibo(int a){
        if (a ==1||a==2){
            return 1;
        }
        return angkafibo(a-1)+angkafibo(a-2);
        
    }
    
    public static int fiboloop(int a){
        if (a==1||a==2){
            return 1;
        }
        int fibo1=1, fibo2=1,fiboci =3;
        for (int i=3;i<=a;i++){
            fiboci=fibo1+fibo2;
            fibo1=fibo2;
            fibo2=fiboci;
        }
        return fiboci;
    }
        
    
}
