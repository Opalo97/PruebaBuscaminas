package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        char[] tablero;
        int extensionTablero;
        Scanner entrada = new Scanner(System.in);

        System.out.println("~~BIENVENIDX AL BUSCAMINAS~~");
        System.out.println("=====================================================");
        extensionTablero = pedirNumeroDeExtension(entrada, 5, 15,"¿Cuánta extension quieres que tenga el tablero? [De 5 a 15]: ");
        System.out.println();

       // tablero = generarTablero();

    }

    private static char[] generarTablero(int elementos){
        char[] tablero = new char[elementos];

        for (int i = 0; i < tablero.length; i++){
           // tablero = (int)(Math.random() * 1 );
        }

        return tablero;
    }

    private static int pedirNumeroDeExtension(Scanner entrada, int min, int max, String mensaje) {
        int numero;
        do {
            System.out.print(mensaje);
            numero = entrada.nextInt();
        } while (numero < min || numero > max);

        entrada.nextLine();

        return numero;
    }

}
