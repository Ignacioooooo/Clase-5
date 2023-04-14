import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Ejercicios {
    public static void main (String[] args) throws IOException{
        //b. haga lo mismo, pero solicitando los parámetros de a uno por consola


    }

public static  Integer[] SolicitarPorConsola(int numero1, int numero2, int numero3, char letraA, char letraB) throws IOException{

Integer numeros [] = {numero1,numero2,numero3};
if(letraA == 'A'){
    Arrays.sort(numeros);
} else if (letraB == 'B'){
    Arrays.sort(numeros, Comparator.reverseOrder());
}
 return numeros;

}

    public static Integer[] OrdenarNumeros() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer número por favor");
        int primNumero = scanner.nextInt();
        System.out.println("Ingrese el segundo número por favor");
        int secNumero = scanner.nextInt();
        System.out.println("Ingrese el tercer número por favor");
        int terNumero = scanner.nextInt();
        System.out.println("Indique con A o D el orden deseado de la secuencia de números");
        char letraAoD = scanner.next().charAt(0);
        scanner.close();

        Integer numerosOrdenados[] = {primNumero,secNumero,terNumero};

        if(letraAoD == 'A'){
            Arrays.sort(numerosOrdenados);
        }else if(letraAoD == 'D'){
            Arrays.sort(numerosOrdenados, Comparator.reverseOrder());
        }
        return numerosOrdenados;

    }

    }








