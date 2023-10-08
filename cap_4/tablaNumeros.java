package cap_4;

public class tablaNumeros {
    public static void main(String[] args) {
        int contador = 1;
        
        System.out.println("N   10*N    100*N   1000*N");
        
        while(contador <=5){
            System.out.printf("%d     %d      %d     %d%n", contador, contador*10, contador*100, contador*1000);
            contador++;
        }
    }
}
