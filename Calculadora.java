/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadora;

//LopezRDEL

import java.util.Scanner;


public class Calculadora {

    public static void main(String[] args) {
       Scanner lector = new Scanner(System.in);
       int num1,num2;
       num1= lector.nextInt();
       num2= lector.nextInt();
       
        int suma, resta, multiplicacion, operacion = 0;
            
       float division;
       
        while (operacion >=0)
            System.out.println("Bienvenido a la calculadora"); 
        
        System.out.println("Que operacion desea realizar? ");
        
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicacion");
        System.out.println("4. Division");
        System.out.println("5. Terminar");
        
        operacion = lector.nextInt();
        
        if (operacion == 1) {
            suma = num1 + num2;
            
            System.out.println("La suma de sus numeros es " + suma);
            
        }
        else {
        
            if (operacion ==2 ) {
              resta = num1 - num2;
              
                System.out.println("La resta de sus numeros son " + resta);
            }
            else{
                
                if (operacion == 3) {
                    multiplicacion = num1 * num2; 
                    
                    System.out.println("La multiplicacion de sus numeros es " + multiplicacion);
                    
                }
   
            else {
                    if (operacion ==4) {
                        division = num1 / num2;
                        System.out.println("La division de sus numeros es " + division);
                    }
                    
                    else {
                        if (operacion == 5) {
                            System.out.println("El programa ha finalizado ");
                        }
                    
                    }
                    
                }
            
            
            }
         
        }
        
        
        
        
        
       
    }
}
