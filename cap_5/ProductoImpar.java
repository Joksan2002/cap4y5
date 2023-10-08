package cap_5;

public class ProductoImpar{
    public static void main(String[] args){

        int producto = 1;

        for(int num = 1; num <= 15; num++ ){
            if (num % 2 != 0){
                System.out.printf("%d es impar%n", num);
                producto *= num; 
            }
        }
        System.out.print("El producto de los numeros impares del 1 al 15 es: "+ producto);
    }
}