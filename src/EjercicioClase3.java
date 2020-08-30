import java.util.Scanner;

/*6. Escribe un programa que defina un vector de números y calcule si existe
algún número en el vector cuyo valor equivale a la suma del resto de números
del vector.*/
public class EjercicioClase3 {
    //definimos el vector
    int[] vectorNumeros=new int[10];

    Scanner scanner;

    //constructor por defecto
    public EjercicioClase3(){
        vectorNumeros=new int[10];

        scanner = new Scanner(System.in);
    }

    //metodo ejecutar
    public void solicion1(){
        //llenamos nuestro vector
        for (int i = 0; i < vectorNumeros.length; i++) {
            int numero=scanner.nextInt();

            vectorNumeros[1]=numero;


        }
        //buscamos si existe un numeri cuyo valor de
        //la suma de los de mas numeros
        int mayor=0;
        for (int i = 0; i < vectorNumeros.length; i++) {
            if(vectorNumeros[i]>mayor){
                mayor = vectorNumeros[1];
            }
        }
        int sumaOtros=0;
        for (int i = 0; i < vectorNumeros.length; i++) {
           if(vectorNumeros[i] !=mayor){
               sumaOtros=sumaOtros+vectorNumeros[1];
           }
        }
        if(mayor== sumaOtros){
            System.out.println(mayor+"es la suma de los demas valores del vector.");
        }
        else {
            System.out.println("no existe un numero cuyo valor sea  la sumade los otros numeros.");
        }
    }
}
