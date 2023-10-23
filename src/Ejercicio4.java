import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        //Declarar un Array de 5 posiciones de tipo  char y hay que leerlo por la consola
        // Scaner - usando el metodo next() del Scaner y el metodo charArt() del String

        //char letra [], xx - declarar array de una solo variable

        Scanner sc = new Scanner(System.in);
        char [] letras=new char[5];
        letras [0]= 'A';
        letras [1]= 'B';
        letras [2]= 'C';
        letras [3]= 'D';
        letras [4]= 'E';
           // System.out.println("Escriba la letra->");
           // letras[i] = sc.next().charAt(0);
            // dos lineas
            for(int i = 0; i<letras.length;i++){
                System.out.println("escriba la letra ->");
                String palabra = sc.next();
                letras[i] = palabra.charAt(0);
            }

        }



    }
