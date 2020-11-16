package sorting;

abstract class SortingMethodsFactory {

    static SortingMethods getInstance(String sortingType, String inputFile, String outputFile) {

        SortingMethods methods = new NaturalSort(inputFile, outputFile);

        if ("byCount".equals(sortingType)) {
            methods = new SortByCount(inputFile, outputFile);
        } else {
            methods = new NaturalSort(inputFile, outputFile);
        }
        return methods;
    }
}
