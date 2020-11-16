package sorting;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class SortByCount extends SortingMethodsFactory {

    SortByCount(String inputFile, String outputFile) {
        super(inputFile, outputFile);
    }

    static Scanner scan = new Scanner(System.in);

    public void argLong(String inputFile, String outputFile) throws IOException {

        ArrayList<Integer> listInt = new ArrayList<>();

        Map<Integer, Integer> mapInt = new HashMap<>();

        if (inputFile != null) {
            try (Scanner scanner = new Scanner(inputFile)) {
                while (scanner.hasNext()) {
                    int nextNumber = scanner.nextInt();
                    listInt.add(nextNumber);
                }
            }
        } else {
            while (scan.hasNext()) {
                int nextNumber = scan.nextInt();
                listInt.add(nextNumber);
            }
        }

        for (int z : listInt) {
            if (!mapInt.containsKey(z)) {
                mapInt.put(z, 1);
            } else {
                mapInt.put(z, mapInt.get(z) + 1);
            }
        }

        LinkedHashMap<String, Integer> sortedMapInt = new LinkedHashMap<>();

        mapInt.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .forEachOrdered(x -> sortedMapInt.put(String.valueOf(x.getKey()), x.getValue()));

        if (outputFile != null) {
            try (FileWriter writer = new FileWriter(outputFile)) {
                writer.write("Total numbers: " + listInt.size() + ".");
                for (String i : sortedMapInt.keySet()) {
                    int perc = 100 * sortedMapInt.get(i) / mapInt.size();
                    writer.write(i + ": " + sortedMapInt.get(i) + " time(s), " + perc + "%");
                }
            }
        } else {
            System.out.println("Total numbers: " + listInt.size() + ".");
            for (String i : sortedMapInt.keySet()) {
                int perc = 100 * sortedMapInt.get(i) / mapInt.size();
                System.out.println(i + ": " + sortedMapInt.get(i) + " time(s), " + perc + "%");
            }
        }
    }

    @Override
    public void argLine(String inputFile, String outputFile) throws IOException {

        ArrayList<String> listLines = new ArrayList<>();

        Map<String, Integer> mapLines = new LinkedHashMap<>();

        if (inputFile != null) {
            try (Scanner scanner = new Scanner(inputFile)) {
                while (scanner.hasNext()) {
                    String string = scanner.nextLine();
                    listLines.add(string);
                }
            }
        } else {
            while (scan.hasNext()) {
                String string = scan.nextLine();
                listLines.add(string);
            }
        }

        Collections.sort(listLines);

        for (String str : listLines) {
            if (!mapLines.containsKey(str)) {
                mapLines.put(str, 1);
            } else {
                mapLines.put(str, mapLines.get(str) + 1);
            }
        }

        LinkedHashMap<String, Integer> sortedMapInt = new LinkedHashMap<>();

        mapLines.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .forEachOrdered(x -> sortedMapInt.put(String.valueOf(x.getKey()), x.getValue()));

        if (outputFile != null) {
            try (FileWriter writer = new FileWriter(outputFile)) {
                writer.write("Total lines: " + listLines.size() + ".");
                for (String i : sortedMapInt.keySet()) {
                    int perc = 100 * sortedMapInt.get(i) / mapLines.size();
                    writer.write(i + ": " + sortedMapInt.get(i) + " time(s), " + perc + "%");
                }
            }
        } else {
            System.out.println("Total lines: " + listLines.size() + ".");
            for (String i : sortedMapInt.keySet()) {
                int perc = 100 * sortedMapInt.get(i) / mapLines.size();
                System.out.println(i + ": " + sortedMapInt.get(i) + " time(s), " + perc + "%");
            }
        }
    }

    public void argWord(String inputFile, String outputFile) throws IOException {

        ArrayList<String> listWords = new ArrayList<>();
        Map<String, Integer> mapWords = new LinkedHashMap<>();

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


        for (String str : listWords) {
            if (!mapWords.containsKey(str)) {
                mapWords.put(str, 1);
            } else {
                mapWords.put(str, mapWords.get(str) + 1);
            }
        }

        LinkedHashMap<String, Integer> sortedMapWord = new LinkedHashMap<>();

        mapWords.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .forEachOrdered(x -> sortedMapWord.put(String.valueOf(x.getKey()), x.getValue()));

        if (outputFile != null) {
            try (FileWriter writer = new FileWriter(outputFile)) {
                writer.write("Total words: " + listWords.size() + ".");
                for (String i : sortedMapWord.keySet()) {
                    int perc = 100 * sortedMapWord.get(i) / listWords.size();
                    writer.write(i + ": " + sortedMapWord.get(i) + " time(s), " + perc + "%");
                }
            }
        } else {
            System.out.println("Total words: " + listWords.size() + ".");
            for (String i : sortedMapWord.keySet()) {
                int perc = 100 * sortedMapWord.get(i) / listWords.size();
                System.out.println(i + ": " + sortedMapWord.get(i) + " time(s), " + perc + "%");
            }
        }
    }
}
