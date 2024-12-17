package ex2_open_close;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        SortingAlgorithm sorter = chooseSortingAlgorithm();
        sorter.sort();
    }

    public static SortingAlgorithm chooseSortingAlgorithm() {
        Scanner inp = new Scanner(System.in);
        System.out.println("Choose a sorting algorithm:");
        System.out.println("1) Selection Sort");
        System.out.println("2) Merge Sort");
        System.out.println("3) Insertion Sort");

        int choice = inp.nextInt();
        inp.close();

        switch (choice) {
            case 2:
                return new SortMerge();
            case 3:
                return new SortInsertion();
            default:
                return new SortSelection();
        }
    }
}
