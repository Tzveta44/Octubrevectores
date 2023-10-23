public class Vectores3 {
    public static void main(String[] args) {

        //StartWith EndsWith comienza o termina
        //Realizar un bucle para contar los nombres que comienzan con D

        String[] nombres = new String[7];
        nombres [0]="Lola";
        nombres [1]="Pepe";
        nombres [2]="Kiko";
        nombres [3]="Fofi";
        nombres [4]="Bebo";
        nombres [5]="Didi";
        nombres [6]="Xixo";

        System.out.println(nombres [0]);
        System.out.println("Bucle");
        int contador = 0;
        for (int i=0; i<nombres.length;i++) {
            System.out.println(nombres[i].startsWith("D"));
            if (nombres[i].startsWith("D") == true) {
                contador++;

            }
        }
        System.out.println("Hsay"+contador +"Nombres que comienzsan con la D");
    }
}
