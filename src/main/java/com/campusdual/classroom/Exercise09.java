package com.campusdual.classroom;

public class Exercise09 {

    public static void main(String[] args) {
        int Y = 5;

        doWhileLoop(Y);
    }

    //TODO ↓
    // Comprueba el funcionamiento del bucle do-while, que para cada interacción muestre el siguiente mensaje:
    // Entra con valor: X, sale con valor: X+1
    // Entra con valor: X+1, sale con valor: X+2;
    // etc.
    public static void doWhileLoop(int num) {

        int X = 0;

        do {
            
            // Mostrar mensaje indicando con qué valor entra/ sale del bucle
            System.out.println("Entra con valor: "+X+", sale con valor: "+(X+1));
            X++;

        } while (X < num);

    }
}