/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;
import java.util.*;
/**
 *
 * @author MCROBERTW
 */
public class usoClaseScanner {
    public static void main(String[] args)
    {
        String nombre, nombres;
        Integer edad;
        Double sueldo;
        
        Scanner teclado=new Scanner(System.in);
        
        
        
        System.out.print("Aquí solo podrá ingresar su primer nombre:");
        nombre=teclado.next();
        
        /*Cuando se ubica nextline debajo de otro de los métodos NEXT de un objeto Scanner, 
        captura el salto del linea del anterior next, por ello es preferible ponerlo al inicio,
        o si se pone despues de un next, repetirlo 2 veces*/
        
        System.out.print("Aquí solo podrá ingresar todos sus nombres y terminar con enter:");
        nombres=teclado.nextLine(); 
        nombres=teclado.nextLine();
        
        System.out.print("Aquí ingresará su edad:");
        edad=teclado.nextInt();
        
        System.out.print("Aquí ingresará su sueldo");
        sueldo=teclado.nextDouble();
        
        System.out.println("Nombre:"+nombre+"\n"
                + "Nombres:"+nombres+"\n"
                + "Edad:"+edad+"\n"
                + "Edad:"+sueldo+"\n");
    }
}
