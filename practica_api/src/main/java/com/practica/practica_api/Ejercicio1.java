package com.practica.practica_api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Scanner;

@RestController
public class Ejercicio1 {

    @RequestMapping("/")
    public String index() {
        // write your code here
        //Objeto para leer
        Scanner leer = new Scanner(System.in);

        System.out.println("\n ----- Suma de los primeros N números (ej.1) ----- \n");

        //Declaración de variables
        int n, i, suma;

        //Input del número
        System.out.println("Ingrese un número: ");
        n = leer.nextInt();

        //n = 10;

        //for para ir sumando los números
        suma = 0;
        for (i = 0; i <= n; i ++){
            suma = suma + i;
        }
        System.out.println("SUMA = " + suma);

        //Parcear el resultado de la suma a String para poder retornarlo
        String sumastr = Integer.toString(suma);
        String nstr = Integer.toString(n);

        return ("Ejercicio 1: N = " + nstr + "  SUMA = " + sumastr);

        //Ultimas llaves
    }

}
