import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        /*
        String [] nombres = new String[3];
        nombres[0] = "Hernan";

        ArrayList<String> listaNombres = new ArrayList<String>();
        listaNombres.add("Cris");
        listaNombres.add("Romina");

        for (String nombre : listaNombres) {
            System.out.println(nombre);
        }
        */

        int [][] numeros = new int[2][2];
        numeros[0][0] = 1;
        numeros[0][1] = 2;
        numeros[1][0] = 3;
        numeros[1][1] = 4;

        //for (int i = 0; i < numeros.length; i++){
        //    for (int j = 0; j < numeros[i].length; j++){
        //        System.out.print(numeros[i][j]);
        //    }
        //}

        int [][] numeros2 = new int[3][];
        numeros2[0] = new int [2];
        numeros2[1] = new int [3];
        numeros2[2] = new int [5];

        /*numeros2[0][0] = 1;
        numeros2[0][1] = 2;
        numeros2[1][0] = 3;
        numeros2[1][1] = 4;
        numeros2[1][2] = 5;*/

        /*for (int i = 0; i < numeros.length; i++){
            for (int numero : numeros[i]){
                System.out.print(numero);
            }
        }*/


        int valor = 0;

        for (int i = 0; i < numeros2.length; i++){

            for (int numero : numeros2[i]){
                numero = ++valor;
                System.out.print(numero+" ");
            }
            System.out.println(" ");
        }


    }
}
