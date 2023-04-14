import java.io.*;

public class Ejercicio3 {
    public static void  main (String[] args) throws IOException {
//3. Tome el ejercicio 2 de la clase 2 (cifrado cesar: ) y que por parámetro se pueda elegir si es
//una codificación o decodificación, el valor del desplazo, y 2 archivos, uno para la entrada y
//otro para la salida. Que por pantalla solo indique si terminó o no correctamente, los resultados
//deben estar en el archivo de salida

Cesar();
    }

 public static void Cesar() throws IOException{


        String textoParaCifrar = ".\\letrasPorCifrar.txt";

     String textoCifrado = ".\\LetrasCifradas.txt";

     String textoDescifrado = ".\\LetrasDescifradas.txt";



     Ejercicio3.codificarDecodificarArchivo("codi", 1, textoParaCifrar, textoCifrado);

 }


    public static void codificarDecodificarArchivo(String CodiODecodi, int desplazamiento, String archivoOriginal, String archivoDestino) {

        try {
            BufferedReader lector = new BufferedReader(new FileReader(archivoOriginal));

            BufferedWriter escritor = new BufferedWriter(new FileWriter(archivoDestino));

            int c;
            while ((c = lector.read()) != -1) {
                char caracter = (char) c;
                if (Character.isLetter(caracter)) {
                    if (CodiODecodi.equals("codi")) {
                        caracter = codificarCaracter(caracter, desplazamiento);
                    } else if (CodiODecodi.equals("decodi")) {
                        caracter = decodificarCaracter(caracter, desplazamiento);
                    } else{
                        break;
                    }
                }
                escritor.write(caracter);
            }

            lector.close();
            escritor.close();

            if (CodiODecodi == "codi"){

                System.out.println("Archivo " + archivoOriginal + " codificado con éxito.");
            } else if (CodiODecodi == "decodi"){

                System.out.println("Archivo " + archivoOriginal + " decodificado con éxito.");
            } else {

                System.out.println("Valores aceptados para el parámetro CodiODecodi: 'Codi' y 'Decodi'.");
            }


        } catch (IOException e) {
            System.out.println("Error al procesar el archivo: " + e.getMessage());
        }
    }



    private static char codificarCaracter(char caracter, int desplazamiento) {
        if (Character.isLowerCase(caracter)) {
            return (char) ('a' + (caracter - 'a' + desplazamiento) % 26);
        } else {
            return (char) ('A' + (caracter - 'A' + desplazamiento) % 26);
        }
    }

    private static char decodificarCaracter(char caracter, int desplazamiento) {
        if (Character.isLowerCase(caracter)) {
            return (char) ('a' + (caracter - 'a' - desplazamiento + 26) % 26);
        } else {
            return (char) ('A' + (caracter - 'A' - desplazamiento + 26) % 26);
        }
 }






}
