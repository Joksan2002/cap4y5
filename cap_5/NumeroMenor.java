package cap_5;

import java.util.Scanner;

public class NumeroMenor {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        System.out.printf("Cantidad de numeros a evaluar: ");
        int cantidadNum = entrada.nextInt();

        int numeroMenor = 0;

        for(int i = 0; i < cantidadNum; i++){
            System.out.printf("Digite un numero: ");
            int num = entrada.nextInt();

            if (numeroMenor == 0){
                numeroMenor = num;
            }else if(num < numeroMenor){
                numeroMenor = num;
            }
        }
        System.out.printf("El numero menor es "+ numeroMenor);
        entrada.close();
    }
}
