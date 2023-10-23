public class Vectores1 {
    public static void main(String[] args) {

        //Definir un Array de String de 7 posiciones y asignarle valor (nombres)

        String[] nombres = new String[7];
        nombres [0]="Lola";
        nombres [1]="Pepe";
        nombres [2]="Kiko";
        nombres [3]="Fofi";
        nombres [4]="Bebo";
        nombres [5]="Didi";
        nombres [6]="Xixo";
        System.out.println(nombres [0]);
        System.out.println("Bucle");{


        for (int i=0; i<nombres.length; i++)
            System.out.println(nombres[i]);
        }

    }
}
