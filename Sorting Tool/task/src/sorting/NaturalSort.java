package sorting;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class NaturalSort extends SortingMethodsFactory {

    NaturalSort(String inputFile, String outputFile) {
        super(inputFile, outputFile);
    }

    static Scanner scan = new Scanner(System.in);

    public void argLong(String inputFile, String outputFile) throws IOException {

        ArrayList<Integer> listInt = new ArrayList<>();

        if (inputFile != null) {
            try (Scanner scanner = new Scanner(inputFile)) {
                while (scanner.hasNext()) {
                    int nextNumber = scanner.nextInt();
                    listInt.add(nextNumber);
                }
                scanner.close();
            }
        } else {
            while (scan.hasNext()) {
                int nextNumber = scan.nextInt();
                listInt.add(nextNumber);
            }
        }

        Collections.sort(listInt);

        StringBuilder sb = new StringBuilder();
        for (int z : listInt) {
            sb.append(z).append(" ");
        }

        if (outputFile != null) {
            try (FileWriter writer = new FileWriter(outputFile)) {
                writer.write("Total numbers: " + listInt.size() + ".");
                writer.write("Sorted data: " + sb.toString());
                writer.close();
            }

        } else {
            System.out.println("Total numbers: " + listInt.size() + ".");
            System.out.println("Sorted data: " + sb.toString());
        }
    }

    public void argLine(String inputFile, String outputFile) throws IOException {

        ArrayList<String> listLines = new ArrayList<>();

        if (inputFile != null) {
            try (Scanner scanner = new Scanner(inputFile)) {
                while (scanner.hasNext()) {
                    String string = scanner.nextLine();
                    listLines.add(string);
                }
                scanner.close();
            }

        } else {
            while (scan.hasNext()) {
                String string = scan.nextLine();
                listLines.add(string);
            }
        }

        Collections.sort(listLines);

        if (outputFile != null) {
            try (FileWriter writer = new FileWriter(outputFile)) {
                writer.write("Total lines: " + listLines.size() + ".");
                writer.write("Sorted data:");
                for (String z : listLines) {
                    writer.write(z);
                }
                writer.close();
            }

        } else {
            System.out.println("Total lines: " + listLines.size() + ".");
            System.out.println("Sorted data:");
            for (String z : listLines) {
                System.out.println(z);
            }
        }
    }

    public void argWord(String inputFile, String outputFile) throws IOException {

        ArrayList<String> listWords = new ArrayList<>();

        if (inputFile != null) {
            try (Scanner scanner = new Scanner(inputFile)) {
                while (scanner.hasNext()) {
                    String string = scanner.next();
                    listWords.add(string);
                }
            }
        } else {
            while (scan.hasNext()) {
                String string = scan.next();
                listWords.add(string);
            }
        }

        Collections.sort(listWords);

        StringBuilder sb = new StringBuilder();

        for (String z : listWords) {
            sb.append(z).append(" ");
        }

        if (outputFile != null) {
            try (FileWriter writer = new FileWriter(outputFile)) {
                writer.write("Total words: " + listWords.size() + ".");
                writer.write("Sorted data: " + sb.toString());
            }
        } else {
            System.out.println("Total words: " + listWords.size() + ".");
            System.out.println("Sorted data: " + sb.toString());
        }
    }
}
