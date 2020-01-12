package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
    //Objeto para leer
        Scanner leer = new Scanner(System.in);

        System.out.println("\n ----- Suma de los primeros N números (ej.1) ----- \n");

        //Declaración de variables
        int n, i, suma;

        //Input del número
        System.out.println("Ingrese un número: ");
        n = leer.nextInt();

        //for para ir sumando los números
        suma = 0;
        for (i = 0; i <= n; i ++){
            suma = suma + i;
        }
        System.out.println("SUMA = " + suma);

   //Ultimas llaves
    }
}
