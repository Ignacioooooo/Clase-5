import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        //a. haga un main, donde por parámetro ponga 3 números y una letra que represente
        //ascendente o descendente y los muestre ordenados por tal criterio
        //c. lo mismo, pero usando los parámetros si hay alguno (como en a) y haciendo (b) si no
        //detecta ninguno. Vea si con una función puede evitar repetir código.

        ParametrosPorConsola(args);
    }

    public static void ParametrosPorConsola(String[] args){
        //Comprueba si los valores dados por parametro son menores a cuatro, si son menores procede a ejecutar el código
        // En el caso de que no el "return" se encarga de finalizar la ejecución mostrando el mensaje

        if (args.length < 4) {
            System.out.println("Debe introducir 3 numeros y una letra al final (A o B) en los parametros");
            return;
        }
//Acá se crea un Array el cuál lo recorre un bucle for
//luego mediante un try-catch manejamos la Exception, la cuál ocurre porque Integer.parseInt trata de convertir
// todos los valores del Parametro en "int" y al encontrarse con un char se produce dicha Exception
//El mensaje que muestra luego es para indicar que la letra se ha colocado en una posición incorrecta
        int[] numeros = new int[3];
        for (int i = 0; i < 3; i++) {
            try {
                numeros[i] = Integer.parseInt(args[i]);
            } catch (NumberFormatException e) {
                System.out.println("El parametro " + (i + 1) + " no es un numero");
                return;
            }
        }
//Luego se crea una variable char letra, se indica que en el Array del "args" en la cuarta posición se debe
//buscar el char 0, es decir, en el caso de que escriban un String tomaría el valor 0 de dicho String.
//En conclusión toma el char que haya en esa posición
        char letra = args[3].charAt(0);
// En está condicional, se indica que si el char letra es desigual a A y B se muestre el siguiente System.out
        if (letra != 'A' && letra != 'B') {
            System.out.println("La letra debe ser A o B");
            return;
        }
// En las siguientes condicionales se indica que si letra vale "A" el Array es ordenado de manera ascendente
// sino vale "A" se ordena en descendente
// luego se muestra por pantalla mediante un Arrays.toString
        if (letra == 'A') {
            Arrays.sort(numeros);
        } else {
            Arrays.sort(numeros);
            Collections.reverseOrder();
        }

        System.out.println("Numeros ordenados: " + Arrays.toString(numeros));
    }

}