package cap_4;

import java.util.Scanner;

public class Viajes{
    public static void main(String[] args) {
        int km = 0;
        int lt = 0;
        double rendimiento = 0;
        double total = 0;
        
        Scanner entrada = new Scanner(System.in);
        
        char centinela = 's';
        
        while(centinela == 's'){
            System.out.printf("%nIngrese los kilometros recorridos en este viaje: ");
            km = entrada.nextInt();
            System.out.printf("Ingrese los litros usados en este viaje: ");
            lt = entrada.nextInt();
            
            rendimiento = (double)km / lt;
            
            total += rendimiento;
            
            System.out.printf("El rendimiento en este viaje fue de: %.2f km/lt", rendimiento);
            System.out.printf("%n¿Desea ingresar otro viaje? s/n: ");
            centinela = entrada.next().charAt(0);
            
        }
        
        System.out.printf("%nEl total del rendimiento en todos los viajes fue de: %.2f km/lt", total);
        entrada.close();
    }
}