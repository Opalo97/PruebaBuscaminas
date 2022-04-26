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

        tablero = generarTablero(extensionTablero);

        mostrarTablero(tablero);
    }

    private static void mostrarTablero(char[] tablero) {
        for (int i = 0; i < tablero.length; i++) {
            System.out.print("+---");
        }
        System.out.println("+");

        for (int i = 0; i < tablero.length; i++) {
            System.out.print("|");
            System.out.print(" " + tablero[i] + " ");
        }
        System.out.print("|");
        System.out.println();

        for (int i = 0; i < tablero.length; i++) {
            System.out.print("+---");
        }
        System.out.println("+");
       // System.out.println(tablero); System.out.println("+---");  System.out.print("|");
    }

    private static char[] generarTablero(int tam){
        char[] tablero = new char[tam];
        int n, bombas;

        for (int i = 0; i < tablero.length; i++) {
            n = (int) (Math.random() * 2);
            if (n == 0) {
                tablero[i] = '0';
            } else {
                tablero[i] = '*';
            }
        }

        for (int i = 0; i < tablero.length; i++) {
            if (i == 0) {
                if (tablero[i] == '0' && tablero[i + 1] == '*') {
                    tablero[i] = '1';
                }
            } else if (i == tablero.length  - 1) {
                if (tablero[i] == '0' && tablero[i - 1] == '*') {
                    tablero[i] = '1';
                }
            } else if (tablero[i] == '0') {
                bombas = 0;
                if (tablero[i - 1] == '*') {
                    bombas++;
                }
                if (tablero[i + 1] == '*'){
                    bombas++;
                }
                tablero[i] = String.valueOf(bombas).charAt(0);
            }
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
