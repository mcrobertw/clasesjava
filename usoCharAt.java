/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author MCROBERTW
 */
public class usoCharAt {
    public static void main (String[] args){
        String cadena="Robert";
        
        System.out.println("Imprimiendo string desde el inicio: ");
        for(int i=0; i<=cadena.length()-1;i++){
            System.out.print(cadena.charAt(i)+"-");
        }
        
        System.out.println("\nImprimiendo string desde el final: ");
        for(int i=cadena.length()-1; i>=0;i--){
            System.out.print(cadena.charAt(i)+"-");
        }
    }
}
