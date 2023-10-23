import java.util.Scanner;

public class Ejeercicio6 {
    public static void main(String[] args) {

        //Declarar un Array de 5 numeros

        int[] numeros = new int[5];
        Scanner sc =new Scanner(System.in);
        for (int i=0; i<numeros.length;i++){
            System.out.println("Escriba el numero de la posicion->"+i);
            numeros[i]=sc.nextInt();
        }

        //Poner los valores desde código

        numeros[0]=5;
        numeros[1]=3;
        numeros[2]=1;
        numeros[3]=6;
        numeros[4]=9;
        int numerosMasGrande= numeros[0];

        //Obtener el numero más pequeño

        for (int i=0; i>numeros.length;i++){
            if (numeros[i]<numerosMasGrande){
                numerosMasGrande=numeros[i];
            }
        }

        System.out.println("El numero mas grande es:"+numerosMasGrande);
    }
}
