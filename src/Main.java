package com.company;
public class Main {
    public static void main(String[] args) {
    //if, else y else
        int numeroIf = 0;

        if (numeroIf<0){
            System.out.println("La variable numeroIf" + numeroIf + "es negativo");

        }
        else if (numeroIf>0) {
            System.out.println("La variable numeroIf" + numeroIf + "es positivo");
        } else {
            System.out.println("la variable numeroIf es 0");
            
        }

        // while
        int numeroWhile = 1;

        while (numeroWhile < 3){
            numeroWhile++;
            System.out.println("la variable numeroWhile ahora vale " + numeroWhile);
        }

        // do while

        // Al no cumplirse la condicion, solo entra en el bucle una vez
        int numeroDoWhile = 3;
        do {
            numeroDoWhile++;
            System.out.println("La variable numeroDoWhile ahora vale " + numeroDoWhile);
        }while(numeroDoWhile < 3);
        //for
        for (int numeroFor = 0; numeroFor <= 5; numeroFor++){
            System.out.println("la variable numeroFor ahora vale: " + numeroFor);
        }

        //switch
        String estacion = "otoño";
        switch(estacion) {
            case "verano":
                System.out.println("Estamos en verano");
                break;
            case "invierno":
                System.out.println("Estamos en invierno");
                break;
            case "primavera":
                System.out.println("Estamos en primavera");
                break;
            case "otoño":
                System.out.println("Estamos en otoño");
                break;
            default:
                System.out.println("No es una estación");
        }
    }
}