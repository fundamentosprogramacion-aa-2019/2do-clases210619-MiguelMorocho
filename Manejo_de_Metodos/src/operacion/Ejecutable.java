/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operacion;

import java.util.Scanner;

/**
 Generar un proceso que me permita ingresar 5 (de manera obligatoria) ciudades.
 * Si las ciudades no cumplen con la condición (empezar con A,C,D); no se 
 * contabilizan
 */
public class Ejecutable {
    public static void main (String[] args){
        
        int lim = 5; 
        Scanner entrada = new Scanner(System.in);
        int contador = 1;
        String ciudad = "";
        
        while (contador <= lim){
            System.out.println("Ingrese una ciudad");
            ciudad = entrada.nextLine();
            boolean resultado = Operacion.comprobarCadena(ciudad);
            if (resultado == true){
                System.out.printf("%s\n", ciudad);
                contador = contador + 1;
            }else{
                System.out.println ("Valor ingresado fuera de rango");
            }
        }
    }
}
