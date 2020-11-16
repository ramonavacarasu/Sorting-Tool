package sorting;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(final String[] args)  throws IOException {

        String dataType = "word";
        String sortingType = "natural";
        String inputFile = null;
        String outputFile = null;


        Set<String> sortTypes = Set.of("natural", "bycount");
        Set<String> dataTypes = Set.of("word", "long", "line");


        for (int i = 0; i < args.length; i++) {
            switch (args[i]) {
                case "-sortingType":
                    if (i + 1 >= args.length || !sortTypes.contains(args[i + 1].toLowerCase())) {
                        System.out.println("No sorting type defined!");
                        return;
                    }
                    sortingType = args[++i];
                    break;
                case "-dataType":
                    if (i + 1 >= args.length || !dataTypes.contains(args[i + 1].toLowerCase())) {
                        System.out.println("No data type defined!");
                        return;
                    }
                    dataType = args[++i];
                    break;
                case "-inputFile":
                    inputFile = args[++i];
                    break;
                case "-outputFile":
                    outputFile = args[++i];
                    break;
                default:
                    System.out.printf("\"%s\" isn't a valid parameter. It's skipped.%n",
                            args[i]);
                    break;
            }
        }

        SortingMethods solution = SortingMethodsFactory.getInstance(sortingType, inputFile, outputFile);
        assert solution != null;
        if (dataType != null) {
            solution.solve(dataType);
        }

    }
}

