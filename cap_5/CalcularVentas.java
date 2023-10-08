package cap_5;

import java.util.Scanner;

public class CalcularVentas {
    public static void main(String[] args){
        double p1=2.98;
        double p2=4.50;
        double p3=9.98;
        double p4=4.49;
        double p5=6.87;
        double precioVenta=0.0;
        double totalVentas=0.0;

        Scanner entrada = new Scanner(System.in);

        char centinela = 's';

        while(centinela == 's'){

            System.out.printf("%ningrese el numero del producto del 1-5: ");
            int numProducto = entrada.nextInt();
            System.out.printf("cantidad de producto vendido: ");
            int numVenta = entrada.nextInt();

            switch(numProducto){
                case 1: 
                    precioVenta=numVenta*p1;
                    break;
                case 2:
                    precioVenta=numVenta*p2;
                    break;
                case 3:
                    precioVenta=numVenta*p3;
                    break;
                case 4:
                    precioVenta=numVenta*p4;
                    break;
                case 5:
                    precioVenta=numVenta*p5;
                    break;
                default:
                    System.out.println("Numero invalido");     
            }
            totalVentas+=precioVenta;
            System.out.printf("Desea ingresar otra venta s/n: ");
            centinela = entrada.next().charAt(0);
        }
        System.out.printf("%nEl total de ventas de todos los productos vendidos es $%.2f", totalVentas);
        entrada.close();
    }
}
