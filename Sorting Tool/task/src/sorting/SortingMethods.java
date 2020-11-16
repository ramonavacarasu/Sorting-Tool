package sorting;

class SortingMethods {

    static SortingMethodsFactory getInstance(String sortingType, String inputFile, String outputFile) {

        SortingMethodsFactory methods;

        if ("byCount".equals(sortingType)) {
            methods = new SortByCount(inputFile, outputFile);
        } else {
            methods = new NaturalSort(inputFile, outputFile);
        }
        return methods;
    }
}
