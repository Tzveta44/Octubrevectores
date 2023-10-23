public class Ejercicio5 {
    public static void main(String[] args) {

        //Declarar un Array de 5 numeros
        int[] numeros = new int[5];
        //Poner los valores desde código
        numeros[0]=5;
        numeros[1]=3;
        numeros[2]=1;
        numeros[3]=6;
        numeros[4]=9;
        int numerosMasPequienos= numeros[0];
        //Obtener el numero más pequeño
        for (int i=0; i<numeros.length;i++){
            if (numeros[i]<numerosMasPequienos){
                numerosMasPequienos=numeros[i];
            }
        }

        System.out.println("El numro mas pequeño es:"+numerosMasPequienos);
    }
}
