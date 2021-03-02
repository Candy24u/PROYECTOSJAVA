import javax.swing.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sn = new Scanner (System.in);
        boolean salir = false;
        int opcion;
        System.out.println("Bienvenido al programa de operaciones de cadenas");
        while(!salir){
            System.out.println("1. Tamaño");
            System.out.println("2. Subcadena");
            System.out.println("3. Comparacion de palabras");
            System.out.println("4. Comparacion de tamaño");

            System.out.println("\nSeleccione una opcion");
            opcion = sn.nextInt();

            switch(opcion){
                case 1:
                    System.out.println("\n---------Tamaño---------");
                    System.out.println("\nIngrese una oraciòn");
                    Scanner input =new Scanner (System.in);
                    String cadena = input.nextLine();
                    int longitud = cadena.length();
                    System.out.println("\nLa cadena tiene "+longitud+" letras\n");
                    break;

                case 2:
                    System.out.println("\n---------subcadena---------");
                    System.out.println("\nIngrese una oraciòn");
                    Scanner in =new Scanner (System.in);
                    String cad = in.nextLine();
                    int lon = cad.length();

                    //ingresar el indice
                    Scanner val =new Scanner (System.in);
                    System.out.println("Ingrese el indice");
                    int numero = val.nextInt();

                    //ingresar el tamaño
                    Scanner val2 =new Scanner (System.in);
                    System.out.println("Ingrese el tamaño");
                    int numro = val2.nextInt();

                    if(numro>lon){
                        Scanner vai =new Scanner (System.in);
                        System.out.println("El numero es mayor al tamaño de la palabra, ingrese otro nùmero");
                        int num2 = vai.nextInt();
                        String subCadena = cad.substring(numero, num2);
                        System.out.println("\nLa subcadena es: "+subCadena+"\n");
                    }
                    else{
                        //subcadena
                        String subCadena = cad.substring(numero, numro);
                        System.out.println("\nLa subcadena es: "+subCadena+"\n");
                    }

                    break;

                case 3:
                    String pa1, pa2;
                    System.out.println("\n---------Comparacion de palabras---------");
                    System.out.println("\nIngrese la primera palabra");
                    Scanner eri =new Scanner (System.in);
                    pa1 = eri.nextLine();

                    System.out.println("\nIngrese la segunda palabra");
                    Scanner era =new Scanner (System.in);
                    pa2 = era.nextLine();

                    System.out.println("\n¿Desea ignorar las mayusculas?");
                    System.out.println("1. SI");
                    System.out.println("2. NO");
                    opcion = sn.nextInt();

                    switch(opcion){
                        case 1:
                            if (pa1.equalsIgnoreCase(pa2) & pa2.equalsIgnoreCase(pa1)) {
                                System.out.println("\nLas palabras son iguales");
                            }else{
                                System.out.println("\nLas palabras son diferentes");
                            }
                        case 2:
                            if(pa1.equals(pa2)){
                                System.out.println("\nLas palabras son iguales");
                            }else{
                                System.out.println("\nLas palabras son diferentes");
                            }
                            break;
                    }

                    break;

                case 4:
                    System.out.println("\n---------Comparacion de tamaño---------");
                    System.out.println("\nIngrese una oraciòn");
                    Scanner er =new Scanner (System.in);
                    String ca = er.nextLine();

                    System.out.println("\nDesea ignorar los espacios en blanco");
                    System.out.println("1. SI");
                    System.out.println("2. NO");
                    opcion = sn.nextInt();

                    switch(opcion){
                        case 1:
                            System.out.println(ca.replaceAll("\\s",""));
                        case 2:
                            System.out.println(ca);
                }
                    break;
            }
        }


    }
}
