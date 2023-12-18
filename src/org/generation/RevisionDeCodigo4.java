/*
 * 
 * 1.Se pide al jugador 1 y al jugador 2 que introduzcan su elección entre "piedra", "papel" o "tijeras",
 * las elecciones se guardan en las variable "j1" y "j2"
 * 
 * 2. Si las elecciones son iguales, se imprime en consola "Empate" y el juego termina.
 * 
 * 3. Si las elecciones son diferentes, se procede a determinar al ganador a partir de un "if else", con un "switch" 
 * anidado para evaluar la elección del jugador 1, en cada "case" se comparan las elecciones del jugador 2 para determinar el ganador.
 * 
 * 4. Se imprime el resultado del juego, indicando que jugador ganó o si fue un empate.
 * 
 * 5. Si la elección de cada jugador no es "piedra", "papel" o "tijeras" se muestra "Entrada no valida".  
 * 
 * */




package org.generation; // Se cambia el nombre de mi paquete

import java.util.Scanner; // Se importa la clase Scanner del paquete java.util, para obtener la entrada del usuario desde consola

public class RevisionDeCodigo4 { // Se cambia el nombre de la clase 

	public static void main(String[] args) { // Se declara el método main para que se pueda ejecutar el programa
        Scanner s1 = new Scanner(System.in); // Se crea un objeto Scanner llamado s1 para leer la entrada del jugaodr 1, tammbién se agrega System.in para poder leer la entrada del usuario desde la consola 
        Scanner s2 = new Scanner(System.in); // Se movio de lugar esta línea y se agrega System.in para poder leer la entrada del usuario desde la consola 

        System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
        String j1 = s1.nextLine();

        System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): "); // Se cambia el 1 por 2 para indicar al jugador 2 que ingrese su entrada en la consola
        String j2 = s2.nextLine();

        if (j1.equals(j2)) { // Se cambia el operador "igual a" (==) por el uso del método equals para comparar el contenido de dos objetos
            System.out.println("Empate");
        } else {
            int g = 2;
            
            switch(j1) {
            
                case "piedra":
                    if (j2.equals("tijeras")) { // Se cambia el operador "igual a" (==) por el uso del método equals para comparar el contenido de dos objetos
                        g = 1;
                    }
                    break; // Se agrega el break para salir del bloque switch y evitar la ejecución continua de los casos subsiguientes.

                case "papel":
                    if (j2.equals("piedra")) { // Se cambia el operador "igual a" (==) por el uso del método equals para comparar el contenido de dos objetos
                        g = 1;
                    }
                    break; // // Se agrega el break para salir del bloque switch y evitar la ejecución continua de los casos subsiguientes.

                case "tijeras":
                    if (j2.equals("papel")) {
                        g = 1;
                    } //
                    break; // // Se agrega el break para salir del bloque switch y evitar la ejecución continua de los casos subsiguientes.

                default: System.out.println("Entrada no válida"); // Se emplea el default para manejar casos no previstos o entradas no validas y proporciona un comportamiento por defecto cuando no hay coincidencia con ninguno de los case del switch
                    return;
            }
            System.out.println("Gana el jugador " + g);
        }
    }
}
