package sorting;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

abstract class SortingMethodsFactory {

    private Scanner scanner;
    private FileWriter writer;
    private String inputFile;
    private String outputFile;

    SortingMethodsFactory(String inputFile, String outputFile) {
        this.inputFile = inputFile;
        this.outputFile = outputFile;
    }

    void solve(String dataType)  throws IOException {
        switch (dataType) {
            case "long":
                argLong(inputFile, outputFile);
                break;
            case "line":
                argLine(inputFile, outputFile);
                break;
            case "word":
                argWord(inputFile, outputFile);
                break;
            default:
                System.out.println("No data type defined!");
                writer.write("No data type defined!");
                writer.close();
                break;
        }
    }

    abstract void argLong(String inputFile, String outputFile) throws IOException;
    abstract void argLine(String inputFile, String outputFile) throws IOException;
    abstract void argWord(String inputFile, String outputFile) throws IOException;
}
