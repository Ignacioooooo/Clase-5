import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class Ejercicio2A {

    public static void  main (String[] args) throws IOException{
//2. Haga una main donde por parámetro envíe la ruta de un archivo. Ese archivo debe contener
//números. El programa debe escribir por consola la suma de esos números
//a. Al programa anterior agreguele un parámetro para que la operación pueda ser suma o
//multiplicación.

        Archivo();
    }
        public static void Archivo() throws IOException {

            // lee el archivo de texto y almacena las líneas en una lista de strings
            List<String> lineas = Files.readAllLines(Paths.get(".\\Hola.txt"));

            // recorre la lista de líneas y muestra cada número por consola
            lineas.stream()

                    .flatMap(linea -> Arrays.stream(linea.split(" ")))
                    .map(Integer::parseInt)
                    .forEach(System.out::println);


            //Calcula la suma de los números

            int sumaa = lineas.stream()
                    .flatMap(linea -> Arrays.stream(linea.split(" "))).mapToInt(Integer::parseInt)
                    .sum();

            System.out.println("Los números sumados:" + sumaa);

        }

}
