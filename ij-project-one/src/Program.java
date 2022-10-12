import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Program {
    static final String LOCAL_FILE_PATH = "src/localFile.txt";
    static Scanner in = null;

    public static void main(String[] args) {

        boolean finalApp = false;

        System.out.println();
        System.out.println("con este programa podrá manipular un archivo de texto");
        while (!finalApp) {
            printMenu();
            int optionSelected = 0;
            in = new Scanner(System.in);
            try {
                optionSelected = in.nextInt();

            } catch (Exception e) {
                System.out.println("entrada inválida!");
            }

            switch (optionSelected) {
                case (1): {
                    printContentFile(LOCAL_FILE_PATH);
                    break;
                }

                case (2):{
                    clearFile(LOCAL_FILE_PATH);
                    break;
                }

                case (3): {
                    in = new Scanner(System.in);
                    addOneLine(LOCAL_FILE_PATH, in.nextLine());
                    break;
                }
                case (99): {
                    System.out.println("ADIÓS...");
                    finalApp = true;
                    break;
                }

                default: {
                    System.out.println("opción inválida");
                    break;
                }

            }
        }
    }

    static void printMenu() {
        System.out.println("-".repeat(40));
        System.out.println("-".repeat(18) + " MENÚ " + "-".repeat(18));

        System.out.println("1) Mostrar mi archivo");
        System.out.println("2) Limpiar mi archivo");
        System.out.println("3) Agregar nueva linea");
        System.out.println("99) Salir");

        System.out.println("-".repeat(40));
    }

    static void printContentFile(String filePath) {
        try {
            InputStream file = new FileInputStream(filePath);

            byte[] bytesFile = file.readAllBytes();
            System.out.println("-".repeat(40));
            System.out.println("-".repeat(12) + " ARCHIVO DE TEXTO " + "-".repeat(12));
            System.out.println();
            for (byte byteRead : bytesFile) {
                System.out.print((char) byteRead);
            }
            file.close();
            System.out.println();
            System.out.println();

        } catch (IOException e) {
            System.out.println("archivo inválido");
        }
    }

    static void addOneLine(String filePath, String newLine) {
        try {
            InputStream fileRead = new FileInputStream(filePath);
            byte[] oldBytes = fileRead.readAllBytes();
            fileRead.close();

            PrintStream finalfile = new PrintStream(filePath);

            finalfile.write(oldBytes);
            finalfile.write(("\n" + newLine).getBytes());

            finalfile.close();
        } catch (IOException e) {
            System.out.println("archivo no encontrado");
        }

    }

    static void clearFile(String filePath) {
        try {
            PrintStream myFile = new PrintStream(filePath);
            myFile.write(32);
            myFile.close();
        } catch (IOException e) {
            System.out.println("no se pudo abrir el archivo");
        }
    }
}