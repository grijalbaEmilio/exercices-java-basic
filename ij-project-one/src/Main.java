import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class Main {

    final static String[] ONE_DIMENSIONAL_STRING = { "string one", "string two", "string three", "..." };
    final static int[][] TWO_DIMENSIONAL_STRING = { { 1, 2, 3 }, { 1, 2, 3 }, { 80, 2 } };

    public static void main(String[] args) {
        // reverse string
        System.out.println("-".repeat(7) + " reverse String " + "-".repeat(8));
        String myName = "hola mundo";
        System.out.println(reverse((myName)));

        // 1)
        System.out.println("-".repeat(14) + " 1 " + "-".repeat(14));
        for (String element : ONE_DIMENSIONAL_STRING) {
            System.out.println(element);
        }
        System.out.println("-".repeat(31));

        // 2)
        System.out.println("-".repeat(14) + " 2 " + "-".repeat(14));
        for (int i = 0; i < TWO_DIMENSIONAL_STRING.length; i++) {
            for (int j = 0; j < TWO_DIMENSIONAL_STRING[i].length; j++) {
                System.out.println("row: " + i + ", column: " + j + ", value: " + TWO_DIMENSIONAL_STRING[i][j]);
            }
        }
        System.out.println("-".repeat(31));

        // 3)
        System.out.println("-".repeat(14) + " 3 " + "-".repeat(14));

        Vector<Character> vectorChars = new Vector<Character>();

        vectorChars.add('h');
        vectorChars.add('e');
        vectorChars.add('l');
        vectorChars.add('l');
        vectorChars.add('o');

        vectorChars.remove(1);
        vectorChars.remove(2);

        System.out.println(vectorChars);

        System.out.println("-".repeat(31));

        // 4)
        /*
         * el problema de ésto consiste, en caso de que ésta capacidad inicial sea muy
         * inferior a 1000
         * que a medida que vamos agregando elementos al vector y éste se desborde,
         * creará un nuevo
         * arreglo por debajo con el doble de capacidad en el que copiará los datos ya
         * existentes, lo
         * que su pone un consumo de recursos problemático.
         */

        // 5
        System.out.println("-".repeat(14) + " 5 " + "-".repeat(14));

        ArrayList<String> myArrayList = new ArrayList<String>();
        myArrayList.add("element one");
        myArrayList.add("element two");
        myArrayList.add("element three");
        myArrayList.add("element four");

        LinkedList<String> myLinkedList = new LinkedList<String>(myArrayList);

        System.out.println("my ArrayList is: ");
        for (String element : myArrayList) {
            System.out.println(element);
        }
        System.out.println("\nmy LinkedList is: ");
        for (String element : myLinkedList) {
            System.out.println(element);
        }

        System.out.println("-".repeat(31));

        // 6
        System.out.println("-".repeat(14) + " 6 " + "-".repeat(14));

        ArrayList<Integer> integersList = new ArrayList<Integer>();
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            integersList.add(i);
        }
        System.out.println(integersList);

        System.out.println("-".repeat(31));

        // 7
        System.out.println("-".repeat(14) + " 7 " + "-".repeat(14));

        try {
            dividePorCero();
        } catch (ArithmeticException e) {
            System.out.println("Esto no puede hacerse");
        } finally {
            System.out.println("Demo de código");
        }

        System.out.println("-".repeat(31));

        // 8
        System.out.println("-".repeat(14) + " 8 " + "-".repeat(14));

        copyFiletext("src/hello.txt", "src/newFile.txt");

        System.out.println("-".repeat(31));


        //9
        /* 
         * program is in path https://github.com/grijalbaEmilio/exercices-java-basic/tree/main/ij-project-one/src/Program.java
         */
    }

    static String reverse(String texto) {
        String newStringReverse = "";
        for (int i = texto.length() - 1; i >= 0; i--) {
            newStringReverse += texto.charAt(i);
        }
        return newStringReverse;
    }

    static void dividePorCero() throws ArithmeticException {
        throw new ArithmeticException();
    }

    static void copyFiletext(String pathFileToCopy, String pathNewFile) {
        try {
            InputStream file = new FileInputStream(pathFileToCopy);
            byte[] data = file.readAllBytes();
            file.close();

            PrintStream newFile = new PrintStream(pathNewFile);
            newFile.println("this is a Copy of " + pathFileToCopy + "\n");
            newFile.write(data);
            newFile.close();

            System.out.println("Copy success !");

        } catch (FileNotFoundException e) {
            System.out.println("path origin file no valid: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("fail in copy" + e.getMessage());
        }

    }
}