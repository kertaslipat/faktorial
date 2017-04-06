/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.Scanner;

/**
 *
 * @author Praktikan
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      Scanner input = new Scanner (System.in);
        System.out.println ("Banyaknya : ");
        int n = input.nextInt();
        //segitiga atas
        for (int i=0;i<n/2+1;i++) {
            for (int j=0;j<n/2-i;j++){
               System.out.print(" ");
            }
            for (int j=0;j<2*i+1;j++){
               if (i==0 || j==0 || j==2*i)
                    System.out.print("*");
               else
                    System.out.print(" ");
            }
            System.out.println();
        }
        //segitiga bawah
        for (int i=n/2-1;i>=0;i--) {
            for (int j=0;j<n/2-i;j++){
               System.out.print(" ");
            }
            for (int j=0;j<2*i+1;j++){
               if (i==n/2 || j==0 || j==2*i)
                    System.out.print("*");
               else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
    
}
