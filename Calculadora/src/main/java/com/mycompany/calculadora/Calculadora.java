package com.mycompany.calculadora;

//LopezRDEL

import java.util.Scanner;


public class Calculadora {

    public static void main(String[] args) {
       Scanner lector = new Scanner(System.in);
       int num1,num2;
        int suma, resta, multiplicacion, operacion = 0;
            
       float division;
       
        while (operacion != 0)
            System.out.println("Bienvenido a la calculadora"); 
        
        System.out.println("Que operacion desea realizar? ");
        
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicacion");
        System.out.println("4. Division");
        System.out.println("5. Terminar");
        
        operacion = lector.nextInt();
        
     
        
        if (operacion == 1) {
            System.out.println("Ingrese el primer numero ");
            num1 = lector.nextInt();
            System.out.println("Ingrese el segundo numero ");
            num2= lector.nextInt();
            suma = num1 + num2;
            System.out.println("El resultado es " + suma);
            
        }
        else {
        
            if (operacion ==2 ) {
                
            System.out.println("Ingrese el primer numero ");
            num1 = lector.nextInt();
            System.out.println("Ingrese el numero a restar ");
            num2= lector.nextInt();
            resta = num1 - num2;
            System.out.println("El resultado es " + resta);
            
            }
            
            else{
                
                if (operacion == 3) {
                    
                    System.out.println("Ingrese el primer numero ");
                    num1 = lector.nextInt();
                    System.out.println("Ingrese el numero por el cual quiera multiplicar ");
                    num2= lector.nextInt(); 
                    multiplicacion = num1 * num2; 
                    System.out.println("El resultado es " + multiplicacion);
                    
                }
   
            else {
                    if (operacion ==4) {
                        
                        System.out.println("Ingrese el primer numero ");
                        num1 = lector.nextInt();
                        System.out.println("Ingrese el numero por el cual desea dividir ");
                        num2= lector.nextInt(); 
                        if (num2==0) {
                            System.out.println("Error, no se puede dividir entre cero ");
                        }
                        else{
                     division = num1 / num2;
                        System.out.println("El resultado es " + division);
                        }
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